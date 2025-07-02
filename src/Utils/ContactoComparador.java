package Utils;

import java.util.Comparator;

import Models.Contacto;
                                // implements => incluye los metodos de Comparator
public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        
        // 1.Comparar el apellido alfabeticamente
        int resulComparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        // si los apellidos son iguales comparare por el nombre
        if (resulComparacionApellido != 0){
            return resulComparacionApellido;
        }
        int resulComparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());

        return resulComparacionNombre;
    }

}
