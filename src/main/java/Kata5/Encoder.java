package Kata5;

import java.util.Arrays;
import java.util.List;

public class Encoder {

    public static final List<Character> abecedario = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public static String encodePalabra(String palabra){
        String[] letras = palabra.split("");
        StringBuilder palabraCodificada = new StringBuilder();
        try {
            for (String letra : letras) {
                palabraCodificada.append((abecedario.get(posicion(letra))));
            }
        } catch (inputNotValidExcepion e) {
            System.out.print(e.getMessage());
        }
        return palabraCodificada.toString();
    }

    private static int posicion (String letra) throws inputNotValidExcepion {
        int i=0;
        while (!letra.equalsIgnoreCase(String.valueOf(abecedario.get(i))) && i<26){
            i++;
        }
        if (i==26) throw new inputNotValidExcepion("Introduzca una palabra que contenga solo letras y sin carácteres especiales (ni ñ)");
        return i+13;
    }

}
