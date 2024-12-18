
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = entrada.nextLine().toUpperCase();

            boolean encontrado = false;
            for (String estudiante : estudiantes) {

                if (estudiante.toUpperCase().charAt(0) == inicial.charAt(0)) {
                    System.out.println("¡La letra coincide con el nombre: " + estudiante + "!");
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                bandera = false;
            } else {
                System.out.println("No se encontró ninguna coincidencia. Intente de nuevo.");
            }
        }

    }
}
