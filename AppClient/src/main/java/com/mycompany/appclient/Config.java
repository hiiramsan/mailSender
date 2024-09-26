/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appclient;

/**
 *
 * @author carlo
 */
public class Config {
    public String protocolo;
    public String servicio;
    public String cuenta;

    public Config(String protocolo, String servicio, String cuenta) {
        this.protocolo = protocolo;
        this.servicio = servicio;
        this.cuenta = cuenta;
    }
    
    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
