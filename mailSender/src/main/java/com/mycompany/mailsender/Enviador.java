package com.mycompany.mailsender;

/**
 *
 * @author carlo
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
        Servicio servicio = configuracion.getServicio();
        String servidorCorreo = configuracion.getServidorCorreo();
        int puerto = configuracion.getPuerto();
        String usuario = configuracion.getUsuario();
        String contrasena = configuracion.getContrasena();

        servicio.enviar(mail, servidorCorreo, puerto, usuario, contrasena);
        System.out.println("Correo enviado.");
    }
}
