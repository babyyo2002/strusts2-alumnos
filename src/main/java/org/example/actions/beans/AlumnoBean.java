package org.example.actions.beans;

import java.util.Date;
import java.util.List;

public class AlumnoBean {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String email;
    private int telefono;
    private List<String> idiomas;
    private List<String> curso;
    private Date fechaInicio;
    private int nota;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<String> getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getCurso() {
        return curso;
    }
    public void setCurso(List<String> curso) {
        this.curso = curso;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
}
