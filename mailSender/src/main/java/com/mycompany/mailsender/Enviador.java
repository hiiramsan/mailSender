/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mailsender;

/**
 *
 * @author carlos
 */
public class Enviador {

    private Mail correo;
    
    public Enviador() {
        this.correo = new Mail();
    }

    public void enviar(Mail mail, Configuracion configuracion) {
        // Validar el correo
        if (!mail.validar()) {
            return;
        }

        // Validar configuracion
        if (!configuracion.validar()) {
            return;
        }
        Service api = new JakartaAPI(); 
        String servidorCorreo = configuracion.getServidorCorreo(); 
        int puerto = configuracion.getPuerto(); 
        String usuario = configuracion.getUsuario(); 
        String contrasena = configuracion.getContrasena(); 
        
        
        api.enviar(); 
        System.out.println("Correo enviado.");
    }
}
