package com.ista.sistemagua.Model;

import javax.persistence.*;

@Entity
@Table(name="consumo")
public class Consumo {
    private String cedula;
    private int lectura;
    private String fecha;
    private Double pvp;
    private String estado;
    private Double multas;
    private Double contribuciones;

    public Consumo() {

    }

    public Consumo(String cedula, int lectura, String fecha, Double pvp, String estado, Double multas,
            Double contribuciones) {
        this.cedula = cedula;
        this.lectura = lectura;
        this.fecha = fecha;
        this.pvp = pvp;
        this.estado = estado;
        this.multas = multas;
        this.contribuciones = contribuciones;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Column(name = "lectura", nullable = false)
    public int getLectura() {
        return lectura;
    }

    public void setLectura(int lectura) {
        this.lectura = lectura;
    }

    @Column(name = "fecha", nullable = false)
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Column(name = "pvp", nullable = false)
    public Double getPvp() {
        return pvp;
    }

    public void setPvp(Double pvp) {
        this.pvp = pvp;
    }

    @Column(name = "estado", nullable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "multas", nullable = false)
    public Double getMultas() {
        return multas;
    }

    public void setMultas(Double multas) {
        this.multas = multas;
    }

    @Column(name = "contribuciones", nullable = false)
    public Double getContribuciones() {
        return contribuciones;
    }

    public void setContribuciones(Double contribuciones) {
        this.contribuciones = contribuciones;
    }
    
}
