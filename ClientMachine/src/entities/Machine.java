/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

public class Machine implements Serializable {

    private int id;
    private String ref;
    private String marque;
    private double prix;
    private Salle sa;

    public Machine() {
    }

    public Machine(String ref, String marque, double prix, Salle sa) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.sa = sa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    public Salle getSalle() {
        return sa;
    }

    public void setSalle(Salle sa) {
        this.sa = sa;
    }

    @Override
    public String toString() {
        return marque;
    }

}
