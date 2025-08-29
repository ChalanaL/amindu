package com.amart.dao;

import com.amart.model.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.amart.util.HibernateUtil;

public class OrderDao {
    public void saveOrder(Order order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
    // Add more methods as needed
}
