package com.mycompany.mailsender;

/**
 *
 * @author carlo
 */
public interface iMail {
    public void enviarCorreo(Mail mail, Configuracion config);
    
    public void consultarConfiguracion();
}
