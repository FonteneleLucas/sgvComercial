/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sgvComercial.mb;

import java.awt.event.ActionEvent;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author lucas
 */
@Named(value = "dataAndTime")
@RequestScoped
public class DataAndTime {

    private Date dataAtual;

    public void buscarDataAtual(ActionEvent e) {
        setDataAtual(new Date());
    }

    /**
     * @return the dataAtual
     */
    public Date getDataAtual() {
        return dataAtual;
    }

    /**
     * @param dataAtual the dataAtual to set
     */
    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }
}
