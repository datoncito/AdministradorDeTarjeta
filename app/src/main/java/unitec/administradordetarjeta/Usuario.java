package unitec.administradordetarjeta;

/**
 * Created by campitos on 17/06/15.
 */
public class Usuario {

    static String login="campos";
   static  String password="malo";
    public static  boolean auntenticar(String usuario, String pas){
        if(usuario.equals(login) && password.equals(pas)){
            return true;
        }
        else{
            return false;
        }
    }
}
