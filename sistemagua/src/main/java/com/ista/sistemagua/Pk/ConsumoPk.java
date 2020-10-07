package com.ista.sistemagua.Pk;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ConsumoPk implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String cedula;
    private String fecha;

    public ConsumoPk() {
    }
    
    public ConsumoPk(String cedula, String fecha) {
        this.cedula = cedula;
        this.fecha = fecha;
    }

    @Column(name = "cedula", length = 10)
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Column(name = "fecha")
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConsumoPk other = (ConsumoPk) obj;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }





}
