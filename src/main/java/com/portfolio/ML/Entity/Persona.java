package com.portfolio.ML.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Persona {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max=50, message="no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max=50, message="no cumple con la longitud")
    private String apellido;
    
    @NotNull
    private String titulo;
    
    @NotNull
    private String descripcion;

    private String img;
    
    private String banner;

     public Persona() {
    }

    public Persona(@NotNull @Size(min = 1, max = 50, message = "no cumple con la longitud") String nombre,
            @NotNull @Size(min = 1, max = 50, message = "no cumple con la longitud") String apellido,
            String titulo, @NotNull String descripcion, String img, String banner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
        this.banner = banner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
