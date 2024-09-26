package com.mycompany.mailsender;

import java.util.List;

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
        String protocolFilePath = "src/datos/protocolos.txt";
        List<String> protocolos = cConfig.consultarProtocolo(protocolFilePath);
        System.out.println("Protocolos disponibles: " + protocolos);

        String serverFilePath = "src/datos/servidores.txt";
        List<String> servidores = cConfig.consultarServicios(serverFilePath);
        System.out.println("Servidores disponibles: " + servidores);

        String cuentasFilePath = "src/datos/cuentas.txt";
        List<String> cuentas = cConfig.consultarCuentas(cuentasFilePath);
        System.out.println("Cuentas disponibles: " + cuentas);
    }

    public List<String> obtenerProtocolos() {
        String protocolFilePath = "src/datos/protocolos.txt";
        return cConfig.consultarProtocolo(protocolFilePath);
    }

    public List<String> obtenerServidores() {
        String serverFilePath = "src/datos/servidores.txt";
        return cConfig.consultarServicios(serverFilePath);
    }

    public List<String> obtenerCuentas() {
        String cuentasFilePath = "src/datos/cuentas.txt";
        return cConfig.consultarCuentas(cuentasFilePath);
    }

}
