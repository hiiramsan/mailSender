package com.mycompany.mailsender;

/**
 *
 * @author carlo
 */
public class FacadeMail implements iMail {

    Enviador enviador = new Enviador();
    ControlConfig cConfig = new ControlConfig();
    
    @Override
    public void enviarCorreo(Mail mail, Configuracion config) {
        enviador.enviar(mail, config);
    }

    @Override
    public void consultarConfiguracion() {
        String protocolFilePath = "stc/datos/protocolos.txt";
        cConfig.consultarProtocolo(protocolFilePath);
        
        String serverFilePath = "src/datos/servidores.txt";
        cConfig.consultarServicios(serverFilePath);
        
    }
    
    
    
}
