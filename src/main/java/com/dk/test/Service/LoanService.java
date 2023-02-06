package com.dk.test.Service;

import com.dk.test.entity.Loan;

import java.util.List;

public interface LoanService {
    public List<Loan> getAllLoans();
    public List<Loan> searchLoans(String surname, String name, String patronymic);
    public List<Loan> searchLoansPhone(String phone);
    public List<Loan> searchLoansPassport(String passport);
    public void saveLoan(Loan loan);
    public Loan getLoan(int id);
    public void deleteLoan(int id);
    List<Loan> getAllLoansSigned();
}
