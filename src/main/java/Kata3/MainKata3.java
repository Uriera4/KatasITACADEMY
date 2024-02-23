package Kata3;

public class MainKata3 {
    public static void main(String[] args) {

        /*
         * Crea un programa que analice texto y obtenga:
         * - Número total de palabras.
         * - Longitud media de las palabras.
         * - Número de oraciones del texto.
         */

        System.out.println("\nPalabras - Oraciones - Longitud media");
        Analizador.unicoBucle("Cuando los jugadores se hayan ido, cuando el tiempo los haya consumido, ciertamente no habrá cesado el rito. En el Oriente se encendió esta guerra cuyo anfiteatro es hoy toda la Tierra. Como el otro, este juego es infinito.");
        Analizador.unicoBucleLambda("Cuando los jugadores se hayan ido, cuando el tiempo los haya consumido, ciertamente no habrá cesado el rito. En el Oriente se encendió esta guerra cuyo anfiteatro es hoy toda la Tierra. Como el otro, este juego es infinito.");
    }
}