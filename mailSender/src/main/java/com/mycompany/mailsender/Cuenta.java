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
public class Cuenta {
    private String email;

    public Cuenta(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static List<Cuenta> leerCuentasDesdeTxt(String filePath) {
        List<Cuenta> listaCuentas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaCuentas.add(new Cuenta(linea.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCuentas;
    }
}
