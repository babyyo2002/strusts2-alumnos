package org.example.actions.beans;

import java.util.Date;
import java.util.List;

public class AlumnoBean {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String email;
    private int edad;
    private List<String> idiomas;
    private String curso;
    private Date fechaInicio;
    private Date fechaFin;

    /**
     * Getter de "nombre".
     * @return devuelve el valor de "nombre".
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de "nombre".
     * @param nombre establece el valor de "nombre".
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de "apellidos".
     * @return devuelve el valor de "apellidos".
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter de "apellidos".
     * @param apellidos establece el valor de "apellidos".
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Getter de "dni".
     * @return devuelve el valor de "dni".
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter de "dni".
     * @param dni establece el valor de "dni".
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Getter de "direccion".
     * @return devuelve el valor de "direccion".
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter de "direccion".
     * @param direccion establece el valor de "direccion".
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter de "edad".
     * @return devuelve el valor de "edad".
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter de "edad".
     * @param edad establece el valor de "edad".
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Getter de "idiomas".
     * @return devuelve el valor de la lista de idiomas.
     */
    public List<String> getIdiomas() {
        return idiomas;
    }

    /**
     * Setter de "idiomas".
     * @param idiomas establece los valores de la lista "idiomas".
     */
    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * Getter de "email".
     * @return devuelve el valor de "email".
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter de "email".
     * @param email establece el valor de "email".
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter de "curso".
     * @return devuelve el valor de "curso".
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Setter de "curso".
     * @param curso establece el valor de "curso".
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Getter de "fechaInicio".
     * @return devuelve el valor de "fechaInicio".
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Setter de "fechaInicio".
     * @param fechaInicio establece el valor de "fechaInicio".
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Getter de "fechaFin".
     * @return devuelve el valor de "fechaFin".
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Setter de "fechaFin".
     * @param fechaFin establece el valor de "fechaFin".
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
