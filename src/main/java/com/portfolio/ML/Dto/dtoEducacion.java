package com.portfolio.ML.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgE;

    public dtoEducacion() {
    }

    public dtoEducacion(@NotBlank String nombreE, @NotBlank String descripcionE, @NotBlank String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    public String getImgE(){
        return imgE;
    }
    
    public void setImgE(String imgE){
        this.imgE = imgE;
    }

    
}
