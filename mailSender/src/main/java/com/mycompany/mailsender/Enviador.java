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
        Service serviceJakarta = new JakartaAPI();
        String servidorCorreo = configuracion.getServidorCorreo();
        int puerto = configuracion.getPuerto();
        String usuario = configuracion.getUsuario();
        String contrasena = configuracion.getContrasena();

        serviceJakarta.enviar();
        System.out.println("Correo enviado.");
        System.out.println("Enviando correo desde: " + mail.getEmail());
        System.out.println("Usando servidor: " + configuracion.getServidorCorreo());
        System.out.println("Protocolo: " + configuracion.getProtocolo());
    }
}
