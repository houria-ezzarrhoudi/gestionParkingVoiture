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
public class PaiementAbonnement {
    private String id;
    private String idVoiture;
    private String type;
    private String idClient;
    private double montant;
    private String datePaiement;

    public PaiementAbonnement() {
    }

    public PaiementAbonnement(String id, String idVoiture, String type, String idClient, double montant, String datePaiement) {
        this.id = id;
        this.idVoiture = idVoiture;
        this.type = type;
        this.idClient = idClient;
        this.montant = montant;
        this.datePaiement = datePaiement;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(String idVoiture) {
        this.idVoiture = idVoiture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }

    @Override
    public String toString() {
        return "PaiementAbonnement{" + "id=" + id + ", idVoiture=" + idVoiture + ", type=" + type + ", idClient=" + idClient + ", montant=" + montant + ", datePaiement=" + datePaiement + '}';
    }
    
}
