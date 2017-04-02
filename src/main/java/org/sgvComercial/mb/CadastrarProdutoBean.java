/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sgvComercial.mb;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.sgvComercial.dao.ProdutoDAO;

import org.sgvComercial.modelo.Produto;

/**
 *
 * @author lucas
 */
//@Named(value = "mbCadastrarProduto")
@Named(value = "mbCadastrarProduto")
@RequestScoped
public class CadastrarProdutoBean {

    Produto produto = new Produto();

    @Inject
    ProdutoDAO produtoDAO;

    public void adicionar() {
        produtoDAO.salvar(produto);
//        System.out.println(produto);
    }

    public Produto getProduto() {
        return produto;
    }

}
