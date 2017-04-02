/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sgvComercial.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.sgvComercial.modelo.Produto;

/**
 *
 * @author lucas
 */
public class ProdutoDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Produto produto) {
        em.persist(produto);
    }

//    public List<Produto> listar() {
//        TypedQuery<Produto> query = em.
//                createQuery("select c from Contratante c", Produto.class);
//        return query.getResultList();
//    }
    public List<Produto> buscarTodos() {
        TypedQuery<Produto> query = em.
                createQuery("select c from Produto c", Produto.class);
        return query.getResultList();
    }

}
