package com.CODEINNOVA.ObjetoSocialMedia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Requirements LogIn")
public class LogIn {

    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String usser;
    private String email;
    private int password;
    private boolean androidOicloud;

    // constructores
    public LogIn() {
    }

    public LogIn(String usser, String email, int password, boolean androidOicloud) {
        this.usser = usser;
        this.email = email;
        this.password = password;
        this.androidOicloud = androidOicloud;
    }

    // getter and setter

    public String getUsser() {
        return usser;
    }

    public void setUsser(String usser) {
        this.usser = usser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean isAndroidOicloud() {
        return androidOicloud;
    }

    public void setAndroidOicloud(boolean androidOicloud) {
        this.androidOicloud = androidOicloud;
    }
}
