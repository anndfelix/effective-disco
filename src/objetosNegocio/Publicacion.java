package objetosNegocio;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Publicacion {

    String idPublicacion, contenido;
    Usuario usuarioCreador;
    LocalDateTime fechaHoraCreacion;
    List<String> etiquetas;
    List<Usuario> usuariosEtiquetados;
    List<Comentario> comentarios;

    public Publicacion(String contenido, Usuario usuarioCreador, LocalDateTime fechaHoraCreacion, List<String> etiquetas, List<Usuario> usuariosEtiquetados, List<Comentario> comentarios) {
        this.idPublicacion = UUID.randomUUID().toString();
        this.contenido = contenido;
        this.usuarioCreador = usuarioCreador;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.etiquetas = etiquetas;
        this.usuariosEtiquetados = usuariosEtiquetados;
        this.comentarios = comentarios;
    }

    public Publicacion(String contenido, Usuario usuarioCreador, LocalDateTime fechaHoraCreacion, List<String> etiquetas, List<Usuario> usuariosEtiquetados) {
        this.contenido = contenido;
        this.usuarioCreador = usuarioCreador;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.etiquetas = etiquetas;
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public String getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(String idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(Usuario usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Usuario> getUsuariosEtiquetados() {
        return usuariosEtiquetados;
    }

    public void setUsuariosEtiquetados(List<Usuario> usuariosEtiquetados) {
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Publicacion de: " + usuarioCreador + " " + fechaHoraCreacion;
    }

    public String publicacion() {
        return usuarioCreador + " " + fechaHoraCreacion + "\n "
                + contenido
                + "\n";
    }

}
