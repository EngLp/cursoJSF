/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroBean;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import registro.Contacto;

/**
 *
 * @author leandropontes
 */
@Named(value = "contactoMBean")
@RequestScoped
public class ContactoMBean {

    /**
     * Nunca meter nada dentro do contrutor.. em modo CDIBean Apagar o construtor
     */
    public ContactoMBean() {
    }
    
    Contacto contacto = new Contacto();
    
    @PostConstruct
    public void inicializar(){
        
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
     public String salvar(){
        return "guardar";
       /* este guardar está a ser chamado na pagina guardar.xhtml, devem ser iguais !!!!*/ 
    }
     
}
