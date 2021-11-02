package objetosNegocio;

public abstract class Mensaje extends Chat {

    String idMensaje;
    String contenido;

    public Mensaje() {
    }

    public Mensaje(String idMensaje, String contenido) {
        this.idMensaje = idMensaje;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public String getIdMensaje() {
        return idMensaje;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setIdMensaje(String idMensaje) {
        this.idMensaje = idMensaje;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "idMensaje=" + idMensaje + ", contenido=" + contenido + '}';
    }

}
