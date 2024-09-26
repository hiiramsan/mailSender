package com.mycompany.mailsender;

/**
 *
 * @author carlo
 */
public class FacadeMail implements iMail {

    @Override
    public void enviarCorreo(Mail mail, Configuracion config) {
        Enviador enviador = new Enviador();

        enviador.enviar(mail, config);
    }

}
