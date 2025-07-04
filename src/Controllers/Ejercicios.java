package Controllers;

import java.util.Set;
import java.util.HashSet;

public class Ejercicios {
    public Ejercicios(){
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5,4,3,2,45}));

        System.out.println("\nEjercicio 2");
        System.out.println(esIsograma( "Murcielago"));
        System.out.println(esIsograma( "Camaleon"));

        System.out.println("\nEjercicio 3");
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        System.out.println(contarPalabrasUnicas(texto));

        System.out.println("\nEjercicio 4");
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        compararTextos(texto1, texto2);
        
    }

    public boolean tieneDuplicados(int[] numeros){
        HashSet<Integer> set = new HashSet<>();
        for (int num: numeros){
            if(!set.add(num)){
                return false;
            }
        }
        return true;
    }

    public boolean esIsograma(String palabra){
        HashSet<Character> set = new HashSet<>();
        for (char letra: palabra.toLowerCase().toCharArray()){
            if(!set.add(letra)){
                return true;
            }
        }

        return false;
    }

    public int contarPalabrasUnicas(String frase){
        Set<String> palabrasUnicas = new HashSet<>();
        String[] palabras = frase.split(" ");

        for(String palabra: palabras){
            if(!palabra.isEmpty()){
                palabrasUnicas.add(palabra);
            }
        }
        return palabrasUnicas.size();
    }
    
    public void compararTextos(String texto1, String texto2){
        Set<String> palabras1 = obtenerPalabras(texto1);
        Set<String> palabras2 = obtenerPalabras(texto2);

        System.out.println("Texto 1: " + palabras1.size() + " palabras unicas");
        System.out.println("Texto 2: " + palabras2.size() + " palabras unicas");

        Set<String> comunes = new HashSet<>(palabras1);
        comunes.retainAll(palabras2);
        System.out.println("Comunes: " + comunes.size());

        Set<String> total = new HashSet<>();
        total.addAll(palabras1);
        total.addAll(palabras2);
        System.out.println("El total es:" + total.size());

        double porcentaje = (comunes.size() * 100) / total.size();
        System.out.println("Porcentaje es: " + porcentaje);

        Set<String> soloEn1 = new HashSet<>(palabras1);
        soloEn1.removeAll(palabras2);
        System.out.println("Solo en texto 1: " + soloEn1);

        Set<String> soloEn2 = new HashSet<>(palabras2);
        soloEn2.removeAll(palabras1);
        System.out.println("Solo en texto 2: " + soloEn2);
    }

    private Set<String> obtenerPalabras(String texto){
    Set<String> palabras = new HashSet<>();
    texto = texto.toLowerCase().replaceAll("[^a-záéíóúüñ ]", "");
    for (String palabra : texto.split("\\s+")){
        if (!palabra.isEmpty()){
            palabras.add(palabra);
        }
    }
    return palabras;
}
}
