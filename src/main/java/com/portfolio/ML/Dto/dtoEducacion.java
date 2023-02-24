package com.portfolio.ML.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String fechaInicio;
    @NotBlank
    private String fechaFin;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgE;

    public dtoEducacion() {
    }

    public dtoEducacion(@NotBlank String nombreE, @NotBlank String descripcionE, @NotBlank String imgE, @NotBlank String fechaInicio, @NotBlank String fechaFin) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
}
