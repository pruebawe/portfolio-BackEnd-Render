package com.portfolio.ML.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {

    @NotBlank
    private String Nombre;

    @NotBlank
    private String Apellido;
    
    @NotBlank
    private String titulo;
    
    @NotBlank
    private String descripcion;

    @NotBlank
    private String img;
    
    @NotBlank
    private String banner;

    public dtoPersona() {
    }

    public dtoPersona(@NotBlank String nombre, @NotBlank String apellido, @NotBlank String titulo, @NotBlank String descripcion,
            @NotBlank String img, @NotBlank String banner) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
        this.banner = banner;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    
    
}
