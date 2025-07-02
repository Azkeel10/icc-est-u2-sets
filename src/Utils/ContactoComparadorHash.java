package Utils;

import java.util.Comparator;
import Models.Contacto;

public class ContactoComparadorHash implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        
        return Integer.compare(c1.hashCode(), c2.hashCode());
    }

}
