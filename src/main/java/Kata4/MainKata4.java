package Kata4;

public class MainKata4 {
    public static void main(String[] args) {

        cuentaAtras(30,2);

    }

    public static void cuentaAtras(int numeroActual, int segundos) {
        if (numeroActual > 0 && segundos > 0) {
            for (int i = numeroActual; i > 0; i--) {
                try {
                    Thread.sleep(segundos * 1000L);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("Los números deben ser positivos y mayor a cero");
        }
    }
}