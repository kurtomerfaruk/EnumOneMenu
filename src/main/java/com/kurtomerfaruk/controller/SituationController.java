/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kurtomerfaruk.controller;

import com.kurtomerfaruk.enumonemenu.ESituation;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 31/05/2016 18:23:24
 */
@ManagedBean
@ViewScoped
public class SituationController implements java.io.Serializable {

    private ESituation[] list;

    private int situation;

    public ESituation[] getList() {
        return ESituation.values();
    }

    public void setList(ESituation[] list) {
        this.list = list;
    }

    public int getSituation() {
        return situation;
    }

    public void setSituation(int situation) {
        this.situation = situation;
    }

    public void update() {
         FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your situation label : " + situation) );
    }

}
