package com.dk.test.Controller;

import com.dk.test.Service.LoanService;
import com.dk.test.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private LoanService loanService;
    @RequestMapping({"/", "/home"})
    public String startView(Model model){

        return "hello-view";
    }
    @RequestMapping("/all-loans")
    public String showAllLoans(Model model){
        List<Loan> allLoans = loanService.getAllLoans();
        model.addAttribute("allLns", allLoans);
        return "all-loans";
    }
    @RequestMapping("/all-clients")
    public String showAllClients(Model model){
        List<Loan> allLoans = loanService.getAllLoans();
        model.addAttribute("allLns", allLoans);
        return "all-clients";
    }
    @RequestMapping("/all-loansSigned")
    public String showAllLoansSigned(Model model){
        List<Loan> allLoans = loanService.getAllLoansSigned();
        model.addAttribute("allLns", allLoans);
        return "all-loans";
    }
    @RequestMapping("/search-loans")
    public String searchLoans(@RequestParam("Surname") String surname,
                              @RequestParam("Name") String name,
                              @RequestParam("Patronymic") String patronymic, Model model){
        List<Loan> allLoans = loanService.searchLoans(surname, name, patronymic);
        System.out.println(surname+" "+name+" "+ patronymic);
        model.addAttribute("allLns", allLoans);
        return "all-loans";
    }
    @RequestMapping("/search-loansPhone")
    public String searchLoansPhone(@RequestParam("Phone") String phone, Model model){
        List<Loan> allLoans = loanService.searchLoansPhone(phone);
        model.addAttribute("allLns", allLoans);
        return "all-loans";
    }
    @RequestMapping("/search-loansPassport")
    public String searchLoansPassport(@RequestParam("Passport") String passport, Model model){
        List<Loan> allLoans = loanService.searchLoansPassport(passport);
        model.addAttribute("allLns", allLoans);
        return "all-loans";
    }
    @RequestMapping("/addNewLoan")
    public String addNewLoan(Model model){
        Loan loan = new Loan();
        model.addAttribute("loan", loan);
        return "loan-info";
    }
    @RequestMapping("/saveLoan")
    public String saveLoan(
            @Valid @ModelAttribute("loan") Loan loan, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            return "loan-info";
        }
        else {
            int a = (int) (Math.random() * 10);
            if (a % 2 == 0) {
                loan.setApproved("Одобрен");
                BigDecimal sum = loan.getSum();
                BigDecimal rnd = getRandomValue(sum);
                loan.setSum(rnd);
                loan.setLoan_term(getRandomLoanTime());
                loan.setSigned("Не подписан");
                loanService.saveLoan(loan);
                return "loan-result-good";
            } else loan.setApproved("Не одобрен");
            loanService.saveLoan(loan);
            return "loan-result-bad";
        }
    }
    @RequestMapping("/loan-result-bad")
    public String resultLoanBad(@ModelAttribute("loan") Loan loan){
        return "redirect:/";
    }
    @RequestMapping("/loan-result-good")
    public String resultLoanGood(@ModelAttribute("loan") Loan loan){
        Loan loanGood = loanService.getLoan(loan.getId());
        if(loan.getSigned().equals("Подписан")) {
            loanGood.setSigned("Подписан");
            loanGood.setLoan_date((new Date()).toString());
        } else {
            loanGood.setSigned("Не подписан");
        }
        loanService.saveLoan(loanGood);
        return "redirect:/";
    }
@RequestMapping("/deleteLoan")
    public String deleteLoan(@RequestParam("loanId") int id){
        loanService.deleteLoan(id);
        return "redirect:/all-loans";
    }

    private BigDecimal getRandomValue(BigDecimal max) {
        BigDecimal min = max.divide(BigDecimal.valueOf(2));
        BigDecimal randFromDouble = BigDecimal.valueOf(Math.random());
        BigDecimal sum=(randFromDouble.multiply(max.subtract(min))).add(min);
        sum = sum.setScale(2, BigDecimal.ROUND_HALF_UP);
        return sum;
    }
    private int getRandomLoanTime(){
        int time = (int) (Math.random()*(366-30) +30);
        return time;
    }
}
