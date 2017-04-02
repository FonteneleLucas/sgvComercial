/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sgvComercial.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.sgvComercial.dao.ProdutoDAO;
import org.sgvComercial.modelo.Produto;

/**
 *
 * @author lucas
 */
@Named(value = "mbListarProdutos")
@RequestScoped
public class ListarProdutosBean {

//    @Inject
//    private ProdutoDAO produtoDAO;
//    private List<Produto> produtos = new ArrayList<Produto>();
//
//    @PostConstruct
//    private void loadObjects() {
//        this.produtos = produtoDAO.listar();
//    }
//
//    private List<Produto> getProduto() {
//        return produtos;
//    }
    
    @Inject
    private ProdutoDAO dao;
    private List<Produto> produtos;

    @PostConstruct
    private void init(){
        this.produtos = dao.buscarTodos();
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    

}
