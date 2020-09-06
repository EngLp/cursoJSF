/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroBean;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import registro.Imc;

/**
 *
 * @author leandropontes
 */
@Named(value = "imcCDIBean")
@RequestScoped
public class ImcCDIBean {

    /**
     * apagar este construtor
     */
    public ImcCDIBean() {
    }

    Imc imc = new Imc();

    @PostConstruct
    public void inicializar() {

    }

    public Imc getImc() {
        return imc;
    }

    public void setImc(Imc imc) {
        this.imc = imc;
    }

    public String resultadoIMC() {
        return getImc().getResultado();
    }

}
