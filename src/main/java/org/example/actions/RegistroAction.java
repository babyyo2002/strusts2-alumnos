package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;
import org.apache.struts2.action.SessionAware;
import org.example.actions.beans.AlumnoBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class RegistroAction extends ActionSupport implements SessionAware, ParameterNameAware {

    private AlumnoBean alumno;
    private AlumnoBean detalles;
    private String id;
    private Map<String, Object> userSession;


    /**
     * Método de la interfaz SessionAware que permite que un interceptor de Struts 2 inyecte el objeto
     * de la sesión HTTP en la clase action.
     * @param session a Map of HTTP session attribute name/value pairs.
     */
    @Override
    public void withSession(Map<String, Object> session) {
        userSession = session;
    }

    /**
     * Seguridad para SessionAware. Impide que se acepten parametros que incluyan "session" o "request".
     * @param parameterName representa el nombre del parámetro.
     * @return devuelve allowParameterName en true si el parámetro está permitido.
     */
    @Override
    public boolean acceptableParameterName(String parameterName) {
        boolean allowedParameterName = true ;

        if ( parameterName.contains("session")  || parameterName.contains("request") ) {
            allowedParameterName = false ;
        }

        return allowedParameterName;
    }

    /**
     * Método "Action":
     * Inicia la aplicación en la página index.jsp.
     * @return devuelve "success".
     * @throws Exception
     */

    public String iniciar() throws Exception {
        return SUCCESS;
    }

    /**
     * Método "Action":
     * Lleva a la página de registro y crea un nuevo objeto de AlumnoBean listo
     * para ser rellenado en el formulario.
     * @return devuelve "success".
     * @throws Exception
     */
    public String registro() throws Exception {
        alumno = new AlumnoBean();
        return SUCCESS;
    }

    /**
     * Método "Action":
     * Al objeto "alumno" se le asigna el parámetro "id" del formulario como su DNI.
     * Se almacena el objeto "alumno" ya rellenado con el formulario en el mapa de la sesión HTTP,
     * con su "key" identificadora siendo la "id" intoducida, es decir, el DNI.
     * @return devuelve "success".
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        id = alumno.getDni();
        userSession.put(id,alumno);
        return SUCCESS;
    }

    /**
     * Método "Action":
     * El objeto "detalles" de AumnoBean va a representar un objeto almacenado previamente en la
     * sesión HTTP para obtener sus atributos y mostrarlos en la web.
     * @return devuelve "success".
     * @throws Exception
     */
    public String acceder() throws Exception {
        if(userSession.get(id) == null) {
            return INPUT;
        } else {
            detalles = (AlumnoBean) userSession.get(id);
            return SUCCESS;
        }
    }

    /**
     * Getter de "alumno".
     * @return devuelve el objeto "alumno".
     */
    public AlumnoBean getAlumno() {
        return alumno;
    }

    /**
     * Setter de "alumno".
     * @param alumno establece el objeto "alumno".
     */
    public void setAlumno(AlumnoBean alumno) {
        this.alumno = alumno;
    }

    /**
     * Getter de "detalles".
     * @return devuelve el objeto "detalles".
     */
    public AlumnoBean getDetalles() {
        return detalles;
    }

    /**
     * Setter de "detalles".
     * @param detalles establece el objeto "detalles".
     */
    public void setDetalles(AlumnoBean detalles) {
        this.detalles = detalles;
    }

    /**
     * Getter de "id".
     * @return devuelve el valor de la String "id".
     */
    public String getId() {
        return id;
    }

    /**
     * Setter de "id".
     * @param id establece el valor de la String "id".
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter del mapa de la sesión necesario para la correcta implementación de la interfaz.
     * @param userSession
     */
    public void setUserSession(Map<String, Object> userSession) {
        this.userSession = userSession;
    }

    /**
     * Método que crea y puebla una lista para el formulario.
     * @return devuelve la lista de idiomas que utiliza el formulario.
     */
    public List<String> getListaIdiomas() {
        List<String> listaIdiomas = new ArrayList<>();
        listaIdiomas.add("Español");
        listaIdiomas.add("Inglés");
        listaIdiomas.add("Francés");
        listaIdiomas.add("Alemán");
        return listaIdiomas;
    }

    /**
     * Método que crea y puebla una lista para el formulario.
     * @return devuelve la lista de cursos que utiliza el formulario.
     */
    public List<String> getListaCursos() {
        List<String> listaCursos = new ArrayList<>();
        listaCursos.add("Curso de HTML 5");
        listaCursos.add("Curso de C++");
        listaCursos.add("Curso de JavaScript");
        listaCursos.add("Curso de Java Spring");
        return listaCursos;
    }

}
