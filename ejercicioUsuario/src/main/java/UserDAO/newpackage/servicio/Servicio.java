/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDAO.newpackage.servicio;

import com.mycompany.ejerciciousuario.usuario.Usuario;

/**
 *
 * @author avilagines
 */
public interface Servicio {
    Boolean autenticar (final Usuario u);
    
}
