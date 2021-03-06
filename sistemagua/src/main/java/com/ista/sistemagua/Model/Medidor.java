package com.ista.sistemagua.Model;

import javax.persistence.*;

@Entity
@Table(name = "medidor")
public class Medidor {
    private String id;
    private String marca;
    private String fecha_instalacion;

    public Medidor() {

    }

    public Medidor(String id, String marca, String fecha_instalacion) {
        this.id = id;
        this.marca = marca;
        this.fecha_instalacion = fecha_instalacion;
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "marca", nullable = false)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name = "fecha_instalacion", nullable = false)
    public String getFecha_instalacion() {
        return fecha_instalacion;
    }

    public void setFecha_instalacion(String fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
    }

}
