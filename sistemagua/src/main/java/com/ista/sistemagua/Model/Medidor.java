package com.ista.sistemagua.Model;

import javax.persistence.*;

@Entity
@Table(name = "medidor")
public class Medidor {
    private long id;
    private String marca;
    private String fecha_compra;
    private String estado;

    public Medidor() {

    }

    public Medidor(long id, String marca, String fecha_compra, String estado) {
        this.id = id;
        this.marca = marca;
        this.fecha_compra = fecha_compra;
        this.estado = estado;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "marca", nullable = false)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name = "fecha_compra", nullable = false)
    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Column(name = "estado", nullable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
