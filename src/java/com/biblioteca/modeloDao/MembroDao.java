/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.modeloDao;

/**
 *
 * @author Huzeif
 */
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.biblioteca.model.MembroBean;
import org.hibernate.Session;

import com.biblioteca.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;

public class MembroDao {

    public void salvar(MembroBean membro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(membro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    
}
