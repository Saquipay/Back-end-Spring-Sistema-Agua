package com.ista.sistemagua.Model;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "consumidor")
public class Consumidor {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono_fijo;
    private String telefono_celular;
    private String comunidad;
    private Medidor medidor;
    private Set<Consumo> consumo;

    public Consumidor() {

    }

    public Consumidor(String cedula, String nombre, String apellido, String direccion, String correo,
            String telefono_fijo, String telefono_celular, String comunidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono_fijo = telefono_fijo;
        this.telefono_celular = telefono_celular;
        this.comunidad = comunidad;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "apellido", nullable = false)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Column(name = "direccion", nullable = false)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "correo", nullable = false)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Column(name = "telefono_fijo", nullable = false)
    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    @Column(name = "comunidad", nullable = false)
    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    @Column(name = "telefono_celular", nullable = false)
    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_medidor", referencedColumnName = "id")
    public Medidor getMedidor() {
        return medidor;
    }

    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Consumo> getConsumo() {
		return consumo;
	}

	public void setConsumo(Set<Consumo> consumo) {
		this.consumo = consumo;
	}

    @Override
    public String toString() {
        return "Consumidor [apellido=" + apellido + ", cedula=" + cedula + ", comunidad=" + comunidad + ", consumo="
                + consumo.getClass() + ", correo=" + correo + ", direccion=" + direccion + ", medidor=" + medidor.getClass() + ", nombre="
                + nombre + ", telefono_celular=" + telefono_celular + ", telefono_fijo=" + telefono_fijo + "]";
    }

    




}
