package com.dk.test.Service;

import com.dk.test.DAO.LoanDAO;
import com.dk.test.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    private LoanDAO loanDAO;

    @Override
    @Transactional
    public List<Loan> getAllLoans() {
        return loanDAO.getAllLoans();
    }

    @Override
    @Transactional
    public List<Loan> searchLoans(String surname, String name, String patronymic) {
        return loanDAO.searchLoans(surname, name, patronymic);
    }

    @Override
    @Transactional
    public List<Loan> searchLoansPhone(String phone) {
        return loanDAO.searchLoansPhone(phone);
    }

    @Override
    @Transactional
    public List<Loan> searchLoansPassport(String passport) {
        return loanDAO.searchLoansPassport(passport);
    }

    @Override
    @Transactional
    public void saveLoan(Loan loan) {
        loanDAO.saveLoan(loan);
    }

    @Override
    @Transactional
    public Loan getLoan(int id) {
        return loanDAO.getLoan(id);
    }

    @Override
    @Transactional
    public void deleteLoan(int id) {
        loanDAO.deleteLoan(id);
    }



    @Override
    @Transactional
    public List<Loan> getAllLoansSigned() {
        return loanDAO.getAllLoansSigned();
    }
}
