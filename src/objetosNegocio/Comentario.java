
package objetosNegocio;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

class Comentario {
    
    String idComentario, contenido;
    Usuario usuarioCreador;
    LocalDateTime fechaHoraCreacion;
    Publicacion publicacion;
    List<Usuario> usuariosEtiquetados;

    public Comentario(String contenido, Usuario usuarioCreador, LocalDateTime fechaHoraCreacion, Publicacion publicacion, List<Usuario> usuariosEtiquetados) {
        this.idComentario = UUID.randomUUID().toString();
        this.contenido = contenido;
        this.usuarioCreador = usuarioCreador;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.publicacion = publicacion;
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
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

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public List<Usuario> getUsuariosEtiquetados() {
        return usuariosEtiquetados;
    }

    public void setUsuariosEtiquetados(List<Usuario> usuariosEtiquetados) {
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    @Override
    public String toString() {
        return "Comentario{" + "idComentario=" + idComentario + ", contenido=" + contenido + ", usuarioCreador=" + usuarioCreador + ", fechaHoraCreacion=" + fechaHoraCreacion + ", publicacion=" + publicacion + ", usuariosEtiquetados=" + usuariosEtiquetados + '}';
    }

}
