
import UserDAO.UserImp;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avilagines
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     UserImp u = UsuarioFactoria.get();
        Scanner scn=new Scanner (System.in);      
        System.out.print("Insertar usuario: ");
        String username= scn.nextLine();
        Usuario u = new (username, password);

}
}
