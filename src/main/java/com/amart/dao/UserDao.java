package com.amart.dao;

import com.amart.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.amart.util.HibernateUtil;

public class UserDao {
    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
    // Add more methods as needed
}
