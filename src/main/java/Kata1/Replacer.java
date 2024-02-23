package Kata1;

import java.util.Arrays;
import java.util.List;

public abstract class Replacer {

    public static final List<Character> abecedari = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    public static final List<Character> vocals = Arrays.asList('a','e','i','o','u');
    public static final List<Character> consonants = Arrays.asList('b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z');
    public static char getTheNearest(char c) {
        char replace;
        if (abecedari.contains(c)) {
            if (vocals.contains(c)) {
                if (c == 'a') {
                    replace = 'z';
                } else {
                    replace = abecedari.get(abecedari.indexOf(c) - 1);
                }
            } else {
                replace = canviaConsonant(consonants.indexOf(c));
            }
        } else {
            replace = ' ';
        }
        return replace;
    }

    public static char canviaConsonant(int i){
        char caracter;
        if (i<3){
            caracter = 'e';
        } else if (i<6){
            caracter = 'i';
        } else if (i<11){
            caracter = 'o';
        } else if (i<16){
            caracter = 'u';
        } else {
            caracter = 'a';
        }
        return caracter;
    }

}