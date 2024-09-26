package com.mycompany.appclient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julli
 */
public class UsuarioConfig {

    private String email;
    private String servidor;
    private String protocolo;

    public UsuarioConfig(String email, String servidor, String protocolo) {
        this.email = email;
        this.servidor = servidor;
        this.protocolo = protocolo;
    }

    public String getEmail() {
        return email;
    }

    public String getServidor() {
        return servidor;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public static List<UsuarioConfig> leerUsuariosDesdeTxt(String filePath) {
        List<UsuarioConfig> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 3) {
                    usuarios.add(new UsuarioConfig(datos[0], datos[1], datos[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
