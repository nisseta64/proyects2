/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDAO;

import com.mycompany.ejerciciousuario.usuario.Usuario;
import java.util.ArrayList;


import java.util.List;
import java.util.Objects;


/**
 *
 * @author avilagines
 */
class UserDAO implements UserImp {
        private final List<Usuario> usuarios;
public UserDAO() {
        this.usuarios = new ArrayList<>();
    }
    @Override
    public void nueva(Usuario u) {
     Objects.requireNonNull(u);
        assert Objects.isNull(u.getUser());
        assert Objects.isNull(u.getPassword());
       
       usuarios.add(u);
       
    }



    @Override
    public Boolean existe(Usuario u) {
     
        for (Usuario user : usuarios){
            if(user == u) {
                return true;
            }

            }
            
    return false;
    }


}
