package com.sistema.sistema_ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Personas")
public class Persona {

    @Id
    @Column(name="id_persona")
    private String idPersona;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="Numero_identificacion")
    private String numeroIdentificacion;

    @Column(name="Tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name="Direccion")
    private String direccion;

    @Column(name="Telefono")
    private String telefono;

    @Column(name="Correo")
    private String correo;

    @Column(name="id_rol")
    private String idRol;

    @Column(name="Rh")
    private String rh;

    @Column(name="Tipo_cargo")
    private String tipoCargo;

    @Column(name="id_empleado_asignado")
    private String idEmpleadoAsignado;

    public String getIdPersona() { return idPersona; }
    public void setIdPersona(String idPersona) { this.idPersona = idPersona; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

    public String getTipoIdentificacion() { return tipoIdentificacion; }
    public void setTipoIdentificacion(String tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getIdRol() { return idRol; }
    public void setIdRol(String idRol) { this.idRol = idRol; }

    public String getRh() { return rh; }
    public void setRh(String rh) { this.rh = rh; }

    public String getTipoCargo() { return tipoCargo; }
    public void setTipoCargo(String tipoCargo) { this.tipoCargo = tipoCargo; }

    public String getIdEmpleadoAsignado() { return idEmpleadoAsignado; }
    public void setIdEmpleadoAsignado(String idEmpleadoAsignado) { this.idEmpleadoAsignado = idEmpleadoAsignado; }
}