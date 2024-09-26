/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ControlConfig {
    
    public List<String> consultarProtocolo(String filePath) {
        List<String> protocolos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 1) {
                    protocolos.add(datos[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return protocolos;
    }

    public List<String> consultarServicios(String serverFilePath) {
        List<String> servicios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(serverFilePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 1) {
                    servicios.add(datos[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return servicios;
    }
    
}
