
public class Ejercicio_4 {

    public static void main(String[] args) {
        int[] numeros = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double mediaA = 0;
        int conta1 = 0, conta2 = 0, conta3 = 0;

        for (int i = 0; i < numeros.length; i++) {
            mediaA += numeros[i];
        }
        mediaA /= numeros.length;
        System.out.println("La media aritmetica es: " + mediaA);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mediaA) {
                conta1++;
            } else if (numeros[i] < mediaA) {
                conta2++;
            } else {
                conta3++;
            }
        }

        System.out.println("Numeros arriba de la media aritmética: " + conta1);
        System.out.println("Numeros bajo la media aritmética: " + conta2);
        System.out.println("Numeros iguales a la media aritmética: " + conta3);
    }
}
/**
 *run:
La media aritmetica es: 9.538461538461538
Numeros arriba de la media aritmética: 8
Numeros bajo la media aritmética: 5
Numeros iguales a la media aritmética: 0
 */
