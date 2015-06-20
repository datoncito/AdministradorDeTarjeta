package unitec.administradordetarjeta;

import java.io.Serializable;

/**
 * Created by campitos on 17/06/15.
 */
public class Tarjeta implements Serializable {
    String nombre;
    int diaCorte;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiaCorte() {
        return diaCorte;
    }

    public void setDiaCorte(int diaCorte) {
        this.diaCorte = diaCorte;
    }
}
