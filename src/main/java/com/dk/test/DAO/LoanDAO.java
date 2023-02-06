package com.dk.test.DAO;

import com.dk.test.entity.Loan;

import java.util.List;

public interface LoanDAO {
    List<Loan> getAllLoans();
    List<Loan> searchLoans(String surname, String name, String patronymic);
    List<Loan> searchLoansPhone(String phone);
    List<Loan> searchLoansPassport(String passport);
    void saveLoan(Loan loan);
    void deleteLoan(int id);
    Loan getLoan(int id);
    List<Loan> getAllLoansSigned();
}
