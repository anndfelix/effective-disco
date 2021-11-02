package DAO;

import Excepcion.DAOException;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Publicacion;

public class PublicacionDAO {

    private static List<Publicacion> publicaciones = new ArrayList<Publicacion>();

    public Publicacion obten(Publicacion publicacion) throws DAOException {

        int pos = publicaciones.indexOf(publicacion);

        if (pos >= 0) {
            return publicaciones.get(pos);
        }
        return null;

    }

    public void agrega(Publicacion publicacion) {

        publicaciones.add(publicacion);

    }

    public void actualiza(Publicacion publicacion) throws DAOException {

        int pos = publicaciones.indexOf(publicacion);

        if (pos < 0) {
            throw new DAOException("Publicacion inexistente");
        }

        publicaciones.set(pos, publicacion);

    }

    public List<Publicacion> lista() throws DAOException {

        return publicaciones;

    }

}
