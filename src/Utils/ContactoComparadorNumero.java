package Utils;

import java.util.Comparator;
import Models.Contacto;

public class ContactoComparadorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        int resulComparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (resulComparacionApellido != 0) {
            return resulComparacionApellido;
        }

        int resulComparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (resulComparacionNombre != 0) {
            return resulComparacionNombre;
        }

        return c2.getTelefono().compareToIgnoreCase(c1.getTelefono());
    }
    
    
}
