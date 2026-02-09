package fenix;

import java.util.List;

/**
 * Esta clase procesa listas de usuarios.
 * <p>
 * A partir de una lista con formato "nombre:rol",
 * clasifica a los usuarios según su rol.
 * </p>
 */
public class ProcesadorUsuarios {

    /** Rol administrador */
    private static final int ROL_ADMIN = 1;

    /** Rol invitado */
    private static final int ROL_INVITADO = 2;

    /**
     * Procesa una lista de usuarios y devuelve un resumen
     * de administradores e invitados.
     *
     * @param usuarios lista de usuarios con formato "nombre:rol"
     * @return cadena con los administradores e invitados
     */
    public String procesarLista(List<String> usuarios) {
        String admins = "";
        String invitados = "";

        for (String usuario : usuarios) {
            String[] partes = usuario.split(":");
            if (partes.length == 2) {
                String nombre = partes[0];
                int rol = Integer.parseInt(partes[1]);

                if (rol == ROL_ADMIN) {
                    admins += procesarAdmin(nombre);
                } else if (rol == ROL_INVITADO) {
                    invitados += procesarInvitado(nombre);
                }
            }
        }
        return "Admins: " + admins + " | Invitados: " + invitados;
    }

    /**
     * Procesa un usuario administrador.
     *
     * @param nombre nombre del administrador
     * @return nombre formateado
     */
    private String procesarAdmin(String nombre) {
        return nombre + ",";
    }

    /**
     * Procesa un usuario invitado.
     *
     * @param nombre nombre del invitado
     * @return nombre formateado
     */
    private String procesarInvitado(String nombre) {
        return nombre + ",";
    }
}

