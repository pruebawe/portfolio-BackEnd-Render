package com.portfolio.ML.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descriptionE;
    @NotBlank
    private String imgE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descriptionE, String imgE) {
        this.nombreE = nombreE;
        this.descriptionE = descriptionE;
        this.imgE = imgE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescriptionE() {
        return descriptionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descriptionE = descriptionE;
    }
    
    public String getImgE(){
        return imgE;
    }
    
    public void setImgE(String imgE){
        this.imgE = imgE;
    }
}
