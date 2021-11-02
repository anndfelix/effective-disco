package control;

import DAO.PublicacionDAO;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComboBox;
import objetosNegocio.Sexo;
import objetosNegocio.Usuario;
import DAO.UsuarioDAO;
import Excepcion.DAOException;
import interfaz.MuroDlg;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import objetosNegocio.Notificacion;
import objetosNegocio.Publicacion;

public class Control {

    UsuarioDAO udao = new UsuarioDAO();
    PublicacionDAO pdao = new PublicacionDAO();
    List<Sexo> sexoUsuario = udao.listaSexoUsuario();
    List<Usuario> usuarios = udao.lista();
    List<Publicacion> publicaciones = pdao.lista();
    public static ArrayList<Usuario> usuariosEtiquetados = new ArrayList<>();
    public static ArrayList<Notificacion> notificaciones = new ArrayList<>();

    public void llenarComboboxSexoUsuario(JComboBox<Sexo> comboBoxSexoUsuario) {
        Iterator it = sexoUsuario.iterator();
        Sexo s;

        try {
            while (it.hasNext()) {
                s = (Sexo) it.next();
                comboBoxSexoUsuario.addItem(s);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void llenarComboboxUsuarios(JComboBox<Usuario> comboBoxUsuarios) {
        Iterator it = usuarios.iterator();
        Usuario u;

        try {
            while (it.hasNext()) {
                u = (Usuario) it.next();
                comboBoxUsuarios.addItem(u);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Usuario confirmarUsuario(String email, String contraseña) throws Exception {
        Usuario usuario = new Usuario(email, contraseña);

        for (Usuario u : usuarios) {
            if (u.getContraseña().equals(usuario.getContraseña()) && u.getEmail().equals(usuario.getEmail())) {
                return u;
            }
        }

        return null;
    }

    public List<String> listaEtiquetas(String contenido) {

        Pattern p = Pattern.compile("(#[^#\\s]*)");
        Matcher m = p.matcher(contenido);
        List<String> etiquetas = new ArrayList<String>();

        while (m.find()) {
            etiquetas.add(m.group());
        }

        return etiquetas;

    }

    public List<Publicacion> listaPublicacionesBuscadas(String etiqueta) {
        List<Publicacion> publicacionesEtiquetadas = new ArrayList<Publicacion>();

        for (Publicacion p : publicaciones) {

            List<String> pub = p.getEtiquetas();

            for (String etiquetas : pub) {
                if (etiquetas.equals(etiqueta)) {
                    publicacionesEtiquetadas.add(p);
                }
            }

        }

        return publicacionesEtiquetadas;
    }

    public ArrayList<String> listaPublicacionesString() {

        ArrayList<String> publicacionesString = new ArrayList<>();
        String pub;

        Collections.reverse(publicaciones);

        for (Publicacion p : publicaciones) {
            pub = "\n" + p.publicacion() + "\n Etiquetados:" + p.getUsuariosEtiquetados() + "\n";
            publicacionesString.add(pub);
        }

        usuariosEtiquetados.clear();
        return publicacionesString;
    }

    public ArrayList<Usuario> etiquetarUsuarios(Usuario usuarioEtiquetado) {

        if (usuariosEtiquetados.contains(usuarioEtiquetado)) {
            System.out.println("Ya ha sido etiquetado!");
        } else {
            usuariosEtiquetados.add(usuarioEtiquetado);
        }

        return usuariosEtiquetados;
    }

    public List<Usuario> listaEtiquetados() throws DAOException {
        List<Usuario> etiquetados = new ArrayList<>();

        for (Usuario usuariosEtiquetado : usuariosEtiquetados) {
            etiquetados.add(usuariosEtiquetado);
        }

        return etiquetados;
    }

    public void eliminarUsuariosEtiquetados(Usuario usuarioEtiquetado) {

        if (usuariosEtiquetados.contains(usuarioEtiquetado)) {
            usuariosEtiquetados.remove(usuarioEtiquetado);
        } else {
            System.out.println("Este usuario no esta etiquetado!");
        }
    }

    public ArrayList<Notificacion> notificarEtiquetas() {

        Notificacion notificacion = new Notificacion();
        List<Usuario> etiquetados = new ArrayList<>();

        for (Publicacion p : publicaciones) {
            etiquetados = p.getUsuariosEtiquetados();

            if (etiquetados.contains(MuroDlg.usuario)) {

                System.out.println(MuroDlg.usuario);
                
                if (notificaciones.contains(notificacion)) {

                } else {

                    notificacion.setAsunto("Has sido etiquetado en una publicacion!");
                    notificacion.setPublicacion(p);
                    notificacion.setFechaHoraEnvio(LocalDateTime.now());
                    notificacion.setUsuarioDestinatario(MuroDlg.usuario);
                    notificacion.setUsuarioRemitente(p.getUsuarioCreador());

                    notificaciones.add(notificacion);
                }
            } else {
                notificaciones.clear();
            }
        }

        return notificaciones;
    }

}
