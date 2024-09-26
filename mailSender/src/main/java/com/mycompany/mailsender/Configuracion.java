package com.mycompany.mailsender;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Configuracion {

    private Protocolo protocolo;
    private List<Cuenta> cuentas;
    private String servidorCorreo;
    private int puerto;
    private String usuario;
    private String contrasena;

    // Constructor
    public Configuracion(Protocolo protocolo, List<Cuenta> cuentas, String servidorCorreo, int puerto, String usuario, String contrasena) {

        this.protocolo = protocolo;
        this.cuentas = cuentas;
        this.servidorCorreo = servidorCorreo;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getServidorCorreo() {
        return servidorCorreo;
    }

    public void setServidorCorreo(String servidorCorreo) {
        this.servidorCorreo = servidorCorreo;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean validar() {
        if (servidorCorreo == null || servidorCorreo.isEmpty() || puerto <= 0) {
            return false;
        }
        return true;
    }
}
