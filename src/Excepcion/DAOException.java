/*
 * DAOException.java
 *
 * Creada el 31 de marzo de 2020, 10:15 AM
 */
package Excepcion;

/**
 * Esta clase representa a las excepciones lanzadas por las clases que se
 * encargan de acceder a los datos en el mecanismo de persistencia.
 *
 * @author Andrea Felix
 */
public class DAOException extends RuntimeException {

    /**
     * Constructor por omisión. Construye una excepción con un mensaje de error
     * nulo.
     */
    public DAOException() {
    }

    /**
     * Construye una excepción con el mensaje de error del parámetro.
     *
     * @param msj Mensaje de error.
     */
    public DAOException(String msj) {
        super(msj);
    }

    /**
     * Construye una excepción con el mensaje de error del parámetro y la causa
     * original del error.
     *
     * @param msj Mensaje de error.
     * @param causa Causa original del error.
     */
    public DAOException(String msj, Throwable causa) {
        super(msj, causa);
    }

    /**
     * Construye una excepción la causa original del error.
     *
     * @param causa Causa original del error.
     */
    public DAOException(Throwable causa) {
        super(causa);
    }

}
