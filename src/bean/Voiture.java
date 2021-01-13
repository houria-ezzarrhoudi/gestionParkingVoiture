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
public class Voiture {

    private String id;
    private String matricule;
    private String model;
    private String marque;
    private String categorie;

    public Voiture() {
    }

    public Voiture(String id, String matricule, String model, String marque, String categorie) {
        this.id = id;
        this.matricule = matricule;
        this.model = model;
        this.marque = marque;
        this.categorie = categorie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Voiture{" + "id=" + id + ", matricule=" + matricule + ", model=" + model + ", marque=" + marque + ", categorie=" + categorie + '}';
    }

}
