package com.ista.sistemagua.Model;

import javax.persistence.*;

@Entity
@Table(name="consumidor")
public class Consumidor {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private long id_medidor;
    private String telefono_fijo;
    private String Telefono_celuluar;

    public Consumidor() {

    }

    public Consumidor(String cedula, String nombre, String apellido, String direccion, String correo, long id_medidor,
            String telefono_fijo, String telefono_celuluar) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.id_medidor = id_medidor;
        this.telefono_fijo = telefono_fijo;
        Telefono_celuluar = telefono_celuluar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Column(name = "nombre", nullable = false)
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
    @Column(name = "id_medidor", nullable = false)
    public long getId_medidor() {
        return id_medidor;
    }

    public void setId_medidor(long id_medidor) {
        this.id_medidor = id_medidor;
    }
    @Column(name = "telefono_fijo", nullable = false)
    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }
    @Column(name = "telefono_celular", nullable = false)
    public String getTelefono_celuluar() {
        return Telefono_celuluar;
    }

    public void setTelefono_celuluar(String telefono_celuluar) {
        Telefono_celuluar = telefono_celuluar;
    }
    
}
    	
    