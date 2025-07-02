package Controllers;

import java.util.TreeSet;
import java.util.Set;
import Models.Contacto;
import Utils.ContactoComparador;
import Utils.ContactoComparadorHash;
import Utils.ContactoComparadorNumero;

public class ContactoController {
//-----------------------------------------------------------------------------
    public ContactoController(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Agenda ordenada por Apellido - Nombre");
        runTreeContacto();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Agenda ordenada por Apellido - Nombre - Telefono");
        runTreeContactoNumeros();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Agenda ordenada por HashCode");
        runTreeContactoHash();
    }
//-----------------------------------------------------------------------------
    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        for (Contacto contacto: agenda){
            System.out.println(contacto);
        }
    }
//-----------------------------------------------------------------------------
    public void runTreeContactoNumeros(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparadorNumero());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        for (Contacto contacto: agenda){
            System.out.println(contacto);
        }
    }
    
//-----------------------------------------------------------------------------
    public void runTreeContactoHash(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparadorHash());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        for (Contacto contacto: agenda){
            System.out.println(contacto);
        }
        
    }
//-----------------------------------------------------------------------------
}
