package com.dk.test.DAO;

import com.dk.test.entity.Loan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class LoanDAOImpl implements LoanDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Loan> getAllLoans() {
        Session session = sessionFactory.getCurrentSession();
        List<Loan> allLoans = session.createQuery("from Loan", Loan.class)
                .getResultList();
        return allLoans;
    }

    @Override
    public List<Loan> searchLoans(String surname, String name, String patronymic) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(
                "from Loan where surname = :surname AND name =:name AND patronymic=:patronymic");
        query.setParameter("surname", surname);
        query.setParameter("name", name);
        query.setParameter("patronymic", patronymic);
        List<Loan> allLoans = query.list();
        return allLoans;
    }

    @Override
    public List<Loan> searchLoansPhone(String phone) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(
                "from Loan where phone =:phone");
        query.setParameter("phone", phone);
        List<Loan> allLoans = query.list();
        return allLoans;
    }

    @Override
    public List<Loan> searchLoansPassport(String passport) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(
                "from Loan where passport =:passport");
        query.setParameter("passport", passport);
        List<Loan> allLoans = query.list();
        return allLoans;
    }

    @Override
    public void saveLoan(Loan loan) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(loan);
    }

    @Override
    public void deleteLoan(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Loan> query = session.createQuery("delete from Loan where id =:loanId");
        query.setParameter("loanId", id);
        query.executeUpdate();
    }

    @Override
    public Loan getLoan(int id) {
        Session session = sessionFactory.getCurrentSession();
        Loan loan = session.get(Loan.class, id);
        return loan;
    }


    @Override
    public List<Loan> getAllLoansSigned() {
        Session session = sessionFactory.getCurrentSession();
        List<Loan> allLoans = session.createQuery("from Loan where signed = 'Подписан'", Loan.class)
                .getResultList();
        return allLoans;
    }
}
