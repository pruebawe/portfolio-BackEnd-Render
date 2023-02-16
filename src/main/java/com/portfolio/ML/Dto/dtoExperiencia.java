package com.portfolio.ML.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String fechaIniE;
    @NotBlank
    private String fechaFinE;
    @NotBlank
    private String descriptionE;
    @NotBlank
    private String imgE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descriptionE, String imgE, String fechaIniE, String fechaFinE) {
        this.nombreE = nombreE;
        this.descriptionE = descriptionE;
        this.imgE = imgE;
        this.fechaIniE = fechaIniE;
        this.fechaFinE = fechaFinE;
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
