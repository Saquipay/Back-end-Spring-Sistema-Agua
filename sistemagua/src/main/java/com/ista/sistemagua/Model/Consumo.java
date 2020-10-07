package com.ista.sistemagua.Model;

import java.io.Serializable;

import javax.persistence.*;

import com.ista.sistemagua.Pk.ConsumoPk;

@Entity
@Table(name = "consumo")
public class Consumo implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ConsumoPk llave;
    private int lectura;
    private Double precio;
    private String estado;
    private Double multa;
    private Double contribucion;
    private Double exceso;
    private Double sobrexceso;
    private Double accesorio;
    private Consumidor consumidor;

    public Consumo() {
    }

    public Consumo(String cedula, String fecha, int lectura, Double precio, String estado, Double multa,
            Double contribucion, Double exceso, Double sobrexceso, Double accesorio) {
        llave = new ConsumoPk(cedula, fecha);
        this.lectura = lectura;
        this.precio = precio;
        this.estado = estado;
        this.multa = multa;
        this.contribucion = contribucion;
        this.exceso = exceso;
        this.sobrexceso = sobrexceso;
        this.accesorio = accesorio;
    }

    @EmbeddedId
    public ConsumoPk getLlave() {
        return llave;
    }

    public void setLlave(ConsumoPk llave) {
        this.llave = llave;
    }

    @MapsId("cedula")
    @ManyToOne
    @JoinColumn(name = "cedula_consumidor", referencedColumnName = "cedula")
    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    @Column(name = "lectura")
    public int getLectura() {
        return lectura;
    }

    public void setLectura(int lectura) {
        this.lectura = lectura;
    }

    @Column(name = "precio")
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "multa")
    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    @Column(name = "contribucion")
    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }

    @Column(name = "exceso")
    public Double getExceso() {
        return exceso;
    }

    public void setExceso(Double exceso) {
        this.exceso = exceso;
    }

    @Column(name = "sobrexceso")
    public Double getSobrexceso() {
        return sobrexceso;
    }

    public void setSobrexceso(Double sobrexceso) {
        this.sobrexceso = sobrexceso;
    }

    @Column(name = "accesorio")
    public Double getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Double accesorio) {
        this.accesorio = accesorio;
    }
    public int hashCode() {
        return llave.hashCode();
    }
    public boolean equals(Object obj) {
        return llave.equals(obj);
    }

    @Override
    public String toString() {
        return "Consumo [accesorio=" + accesorio + ", contribucion=" + contribucion + ", estado=" + estado + ", exceso="
                + exceso + ", lectura=" + lectura + ", llave=" + llave + ", multa=" + multa + ", precio=" + precio
                + ", sobrexceso=" + sobrexceso + "]";
    }



    
}
