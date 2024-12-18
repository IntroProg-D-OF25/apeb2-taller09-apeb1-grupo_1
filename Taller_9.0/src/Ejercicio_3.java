import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> marcas = new ArrayList<>();
        System.out.print("Ingrese el número de marcas que desea almacenar: ");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese los nombres de las marcas (se ignorarán las que comiencen con A, C, T): ");
        while (marcas.size() < cantidad) {
            String marca = teclado.next();
            if (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T") || marca.startsWith("a") || marca.startsWith("c") || marca.startsWith("t")) {
                System.out.println("La marca " + marca + " no es valida");
            } else {
                marcas.add(marca);
            }
        }
        System.out.println("Las " + cantidad + " marcas almacenadas: " + marcas);
    }    
}
/**
 * run:
Ingrese el número de marcas que desea almacenar: 5
Ingrese los nombres de las marcas (se ignorarán las que comiencen con A, C, T): 
HONOR
XIAOMI
INTEL
NOKIA
EPSON
Las 5 marcas almacenadas: [HONOR, XIAOMI, INTEL, NOKIA, EPSON]
 */
