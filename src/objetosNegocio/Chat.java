package objetosNegocio;

import java.util.List;
import java.util.UUID;

public abstract class Chat {

    String idChat;
    List<Usuario> participantes;
    List<Mensaje> mensajes;

    public Chat() {
    }

    public Chat(List<Usuario> participantes, List<Mensaje> mensajes) {
        this.idChat = UUID.randomUUID().toString();
        this.participantes = participantes;
        this.mensajes = mensajes;
    }

    public String getIdChat() {
        return idChat;
    }

    public void setIdChat(String idChat) {
        this.idChat = idChat;
    }

    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Chat{" + "idChat=" + idChat + ", participantes=" + participantes + ", mensajes=" + mensajes + '}';
    }
    
    public abstract void IngresarMensaje(String mensajes);
    public abstract String BuscarMensaje(String mensajes);

}
