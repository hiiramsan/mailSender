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
public class Protocolo {

    private String protocolo;

    public Protocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public static List<Protocolo> leerProtocolosDesdeTxt(String filePath) {
        List<Protocolo> listaProtoclos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 1) {
                    listaProtoclos.add(new Protocolo(datos[0]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaProtoclos;
    }

}
