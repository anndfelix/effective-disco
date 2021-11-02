package objetosNegocio;

import java.time.LocalDateTime;
import java.util.UUID;

public class Notificacion {

    String idNotificacion, asunto;
    Usuario usuarioRemitente, usuarioDestinatario;
    LocalDateTime fechaHoraEnvio;
    Publicacion publicacion;
    Mensaje mensaje;
    Comentario comentario;

    public Notificacion() {
    }

    public Notificacion(String asunto, Usuario usuarioRemitente, Usuario usuarioDestinatario, LocalDateTime fechaHoraEnvio, Publicacion publicacion) {
        this.idNotificacion = UUID.randomUUID().toString();
        this.asunto = asunto;
        this.usuarioRemitente = usuarioRemitente;
        this.usuarioDestinatario = usuarioDestinatario;
        this.fechaHoraEnvio = fechaHoraEnvio;
        this.publicacion = publicacion;
    }

    public Notificacion(String asunto, Usuario usuarioRemitente, Usuario usuarioDestinatario, LocalDateTime fechaHoraEnvio, Mensaje mensaje) {
        this.idNotificacion = UUID.randomUUID().toString();
        this.asunto = asunto;
        this.usuarioRemitente = usuarioRemitente;
        this.usuarioDestinatario = usuarioDestinatario;
        this.fechaHoraEnvio = fechaHoraEnvio;
        this.mensaje = mensaje;
    }

    public Notificacion(String asunto, Usuario usuarioRemitente, Usuario usuarioDestinatario, LocalDateTime fechaHoraEnvio, Comentario comentario) {
        this.idNotificacion = UUID.randomUUID().toString();
        this.asunto = asunto;
        this.usuarioRemitente = usuarioRemitente;
        this.usuarioDestinatario = usuarioDestinatario;
        this.fechaHoraEnvio = fechaHoraEnvio;
        this.comentario = comentario;
    }

    public String getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Usuario getUsuarioRemitente() {
        return usuarioRemitente;
    }

    public void setUsuarioRemitente(Usuario usuarioRemitente) {
        this.usuarioRemitente = usuarioRemitente;
    }

    public Usuario getUsuarioDestinatario() {
        return usuarioDestinatario;
    }

    public void setUsuarioDestinatario(Usuario usuarioDestinatario) {
        this.usuarioDestinatario = usuarioDestinatario;
    }

    public LocalDateTime getFechaHoraEnvio() {
        return fechaHoraEnvio;
    }

    public void setFechaHoraEnvio(LocalDateTime fechaHoraEnvio) {
        this.fechaHoraEnvio = fechaHoraEnvio;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Notificacion: " + asunto;
    }

}
