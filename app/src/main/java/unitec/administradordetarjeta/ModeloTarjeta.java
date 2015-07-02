package unitec.administradordetarjeta;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by campitos on 20/06/15.
 */
public class ModeloTarjeta {
    /*
  Tarjeta tarjeta;
    public ModeloTarjeta(Tarjeta t){
        tarjeta=t;
    }*/

    //Asociacion debil

    public void guardar(Tarjeta t, Context ctx)throws Exception{
    FileOutputStream fos= ctx.openFileOutput("tabla-tarjeta", Context.MODE_PRIVATE);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t);
    }

    //Recuperar la tarjeta

    public Tarjeta leer(Context ctx)throws Exception{
        FileInputStream fis= ctx.openFileInput("tabla-tarjeta");
        ObjectInputStream ois=new ObjectInputStream(fis);
                       Tarjeta t=new Tarjeta();
        t=(Tarjeta)ois.readObject();
        return t;
    }

}





