package com.portfolio.ML.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {

    @NotBlank
    private String Nombre;

    @NotBlank
    private String Apellido;
    
    @NotBlank
    private String descripcion;

    @NotBlank
    private String img;

    public dtoPersona() {
    }

    public dtoPersona(@NotBlank String nombre, @NotBlank String apellido, @NotBlank String descripcion,
            @NotBlank String img) {
        Nombre = nombre;
        Apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
}
