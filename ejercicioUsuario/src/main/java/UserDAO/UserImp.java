/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDAO;

import com.mycompany.ejerciciousuario.usuario.Usuario;

/**
 *
 * @author avilagines
 */

public interface UserImp {
    void nueva (Usuario u);
    Boolean existe(Usuario u);
}
    

