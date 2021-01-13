/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author LENOVO
 */
public class Client {

    private String id;
    private String nom;
    private String prenom;
    private String cin;
    private boolean abonnee;

    public Client() {
    }

    public Client(String id, String nom, String prenom, String cin, boolean abonnee) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.abonnee = abonnee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public boolean isAbonnee() {
        return abonnee;
    }

    public void setAbonnee(boolean abonnee) {
        this.abonnee = abonnee;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", Abonnee=" + abonnee + '}';
    }

}
