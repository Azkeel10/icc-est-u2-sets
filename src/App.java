public class App {
    public static void main(String[] args) throws Exception {
//-----------------------------------------------------------------------------
        System.out.println("----------Programa funcionando----------");
//-----------------------------------------------------------------------------
        Sets sets = new Sets();

        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorInverso(sets);
    }
//-----------------------------------------------------------------------------
    public static void runHashSet(Sets sets) {
        System.out.println("\nElementos en HashSet:");

        for (String palabra : sets.contruirHashSet()) {
            System.out.println(palabra);
        }
    }
//-----------------------------------------------------------------------------
    public static void runLinkedHashSet(Sets sets) {
        System.out.println("\nElementos en LinkedHashSet:");

        for (String palabra : sets.contruirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }
//-----------------------------------------------------------------------------
    public static void runTreeSet(Sets sets) {
        System.out.println("\nElementos en TreeSet:");

        for (String palabra : sets.contruirTreeSet()) {
            System.out.println(palabra);
        }
    }
//-----------------------------------------------------------------------------
    public static void runTreeSetConComparador(Sets sets) {
        System.out.println("\nElementos en TreeSetConComparador:");

        for (String palabra : sets.contruirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }
//-----------------------------------------------------------------------------
    public static void runTreeSetConComparadorInverso(Sets sets) {
        System.out.println("\nElementos en TreeSetConComparadorInverso:");

        for (String palabra : sets.contruirTreeSetConComparadorInverso()) {
            System.out.println(palabra);
        }
    }
//-----------------------------------------------------------------------------
}
