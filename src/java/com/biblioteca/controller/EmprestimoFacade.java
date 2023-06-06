/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.controller;

import com.biblioteca.model.Emprestimo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ablisio
 */
@Stateless
public class EmprestimoFacade extends AbstractFacade<Emprestimo> {

    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmprestimoFacade() {
        super(Emprestimo.class);
    }
    
}
