package com.amart.dao;

import com.amart.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.amart.util.HibernateUtil;

public class ProductDao {
    public void saveProduct(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
    // Add more methods as needed
}
