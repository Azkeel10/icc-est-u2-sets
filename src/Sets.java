import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;;

public class Sets {
//-----------------------------------------------------------------------------
    public Sets(){
    }
//-----------------------------------------------------------------------------
    public Set<String> contruirHashSet(){
        Set<String> palabras = new HashSet<>();

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        

        return palabras;
    }
//-----------------------------------------------------------------------------
    public Set<String> contruirLinkedHashSet(){
        Set<String> palabras = new LinkedHashSet<>();

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");

        return palabras;
    }
//-----------------------------------------------------------------------------
    public Set<String> contruirTreeSet(){
        Set<String> palabras = new TreeSet<>();

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");

        return palabras;
    }
//-----------------------------------------------------------------------------
    public Set<String> contruirTreeSetConComparador(){

        //Implementacion de comparator, para comparacion especifica
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                // 1 compara por la longitud
                int resul = Integer.compare(s1.length(), s2.length());
                if(resul == 0){
                    resul = s1.compareTo(s2);
                    return resul;
                    // return s1.compareTo(s2);
                }
                return resul;

            }
        };

        Set<String> palabras = new TreeSet<>(comparador);

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");

        return palabras;
    }
//-----------------------------------------------------------------------------
public Set<String> contruirTreeSetConComparadorInverso(){

        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                int resul = Integer.compare(s2.length(), s1.length());
                if(resul == 0){
                    resul = s2.compareTo(s1);
                    return resul;
                }
                return resul;

            }
        };

        Set<String> palabras = new TreeSet<>(comparador);

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");

        return palabras;
    }
//-----------------------------------------------------------------------------
}
