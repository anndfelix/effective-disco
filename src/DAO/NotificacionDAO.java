package DAO;

import Excepcion.DAOException;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Notificacion;

public class NotificacionDAO {

    private static List<Notificacion> notificaciones = new ArrayList<Notificacion>();

    public Notificacion obten(Notificacion notificacion) throws DAOException {

        int pos = notificaciones.indexOf(notificacion);

        if (pos >= 0) {
            return notificaciones.get(pos);
        }
        return null;

    }

    public void agrega(Notificacion notificacion) {

        notificaciones.add(notificacion);

    }

    public List<Notificacion> lista() throws DAOException {
        
        return notificaciones;

    }

}
