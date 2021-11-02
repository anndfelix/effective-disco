package DAO;

import Excepcion.DAOException;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Sexo;
import objetosNegocio.Usuario;

public class UsuarioDAO {

    private static List<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuario obten(Usuario usuario) throws DAOException {

        int pos = usuarios.indexOf(usuario);

        if (pos >= 0) {
            return usuarios.get(pos);
        }
        return null;

    }

    public void agrega(Usuario usuario) {

        usuarios.add(usuario);

    }

    public void actualiza(Usuario usuario) throws DAOException {

        int pos = usuarios.indexOf(usuario);

        if (pos < 0) {
            throw new DAOException("Usuario inexistente");
        }

        usuarios.set(pos, usuario);

    }

    public List<Usuario> lista() throws DAOException {
        return usuarios;
    }

    public List<Sexo> listaSexoUsuario() throws DAOException {

        List<Sexo> sexos = new ArrayList<Sexo>();

        sexos.add(Sexo.M);
        sexos.add(Sexo.H);
        sexos.add(Sexo.O);

        return sexos;
    }
    

}
