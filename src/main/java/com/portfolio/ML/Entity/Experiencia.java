package com.portfolio.ML.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String fechaIniE;
    private String fechaFinE;
    private String descriptionE;
    private String imgE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descriptionE, String imgE, String fechaIniE, String fechaFinE) {
        this.nombreE = nombreE;
        this.descriptionE = descriptionE;
        this.imgE = imgE;
        this.fechaIniE = fechaIniE;
        this.fechaFinE = fechaFinE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getFechaIniE() {
        return fechaIniE;
    }

    public void setFechaIniE(String fechaIniE) {
        this.fechaIniE = fechaIniE;
    }

    public String getFechaFinE() {
        return fechaFinE;
    }

    public void setFechaFinE(String fechaFinE) {
        this.fechaFinE = fechaFinE;
    }

    public String getDescriptionE() {
        return descriptionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descriptionE = descriptionE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

    
}
