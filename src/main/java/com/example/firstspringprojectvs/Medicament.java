package com.example.firstspringprojectvs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicament {
    @Id
    private int code;

    @Column(name="libelle")
    private String libelle;

    @Column(name = "prixHT")
    private float prixHT;

    @Column(name = "stockDispo")
    private int stockDispo;

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public float getPrixHT() {
        return prixHT;
    }
    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }
    public int getStockDispo() {
        return stockDispo;
    }
    public void setStockDispo(int stockDispo) {
        this.stockDispo = stockDispo;
    }    
}
