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
    private String nombre;

    public Protocolo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Protocolo> leerProtocolosDesdeTxt(String filePath) {
        List<Protocolo> listaProtocolos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 1) {
                    listaProtocolos.add(new Protocolo(datos[0]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaProtocolos;
    }
}

