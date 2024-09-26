/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mailsender;

/**
 *
 * @author carlo
 */
public class Mail {

    private String subject;
    private String body;
    private String email;
    private String emailTo;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public boolean validar() {
        if (this.emailTo == null || this.emailTo.isEmpty()) {
            throw new IllegalArgumentException("El correo del destinatario no puede estar vacío.");
        }

        // Validar formato de emailTo
        if (!this.emailTo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("El correo del destinatario no tiene un formato valido.");
        }

        // Validar que el asunto no esté vacío
        if (this.subject == null || this.subject.isEmpty()) {
            throw new IllegalArgumentException("El asunto no puede estar vacío.");
        }

        // Validar que el cuerpo del mensaje no esté vacío
        if (this.body == null || this.body.isEmpty()) {
            throw new IllegalArgumentException("El cuerpo del mensaje no puede estar vacío.");
        }
        return true;
    }

}
