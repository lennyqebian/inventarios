package inventarios.Mundo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {

    private String usuario;
    private String clave;

    public String getUsuario() {
        return this.usuario;
    }

    public String getClave() {
        return this.clave;
    }

    public Usuario() {
    }

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    /**
     *
     * @param usuario
     * @param clave
     */
    public boolean login(String usuario, char[] clave, ArrayList<Usuario> usuarios) {
        String clavetxt = new String(clave);
        boolean loggedin = false;
        for (Usuario user : usuarios) {
            if (usuario.equals(user.getUsuario()) && clavetxt.equals(user.getClave())) {
                loggedin = true;
                break;
            }
        }
        if (loggedin) {
            JOptionPane.showMessageDialog(null, "BIENVENIDO " + usuario, "Login", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o clave incorrecto(s)", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}