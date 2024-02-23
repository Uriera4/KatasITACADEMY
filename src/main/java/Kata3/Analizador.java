package Kata3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Analizador {

    public static void unicoBucle(String text){
        String caracter;
        String paraula = "";
        List<String> paraules = new ArrayList<>();
        int oracions = 0;
        double sumaLongitudText = 0;
        for (int i = 0; i<text.length(); i++) {
            caracter = String.valueOf(text.charAt(i));
            if (!caracter.toUpperCase().matches(("[0-9]*[A-Z]*")) && !caracter.matches("[áéíóú]*")){
                paraules.add(paraula);
                if (paraules.getLast().isEmpty()){
                    paraules.removeLast();
                } else {
                    sumaLongitudText += paraules.getLast().length();
                }
                paraula = "";
                if (caracter.matches("[.!?]")) oracions++;
            } else {
                paraula += caracter;
            }
        }
        System.out.println("   " + paraules.size() + "          " + oracions + "           " + String.format("%.2f",(sumaLongitudText/paraules.size())));
    }
    public static void unicoBucleLambda(String text){
        List<String> caracters = Arrays.stream(text.split("\\s*")).filter(caracter -> !caracter.matches(",")).toList();

        int paraules = (int) Arrays.stream(text.split("\\s+")).count();
        int oracions = (int) caracters.stream().filter(caracter -> caracter.matches("[.!?]")).count();
        double sumaLongitudText = caracters.stream().filter(caracter -> !caracter.isEmpty()).filter(caracter -> !caracter.matches("[.!?]")).count();

        System.out.println("   " + paraules + "          " + oracions + "           " + String.format("%.2f",(sumaLongitudText/paraules)));
    }
}
