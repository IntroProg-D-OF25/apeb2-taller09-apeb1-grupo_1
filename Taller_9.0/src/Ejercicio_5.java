
public class Ejercicio_5 {

    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String promcuant;
        for (int i = 0; i < estudiantes.length; i++) {
            if (promedios[i] >= 9) {
                promcuant = "Sobresaliente";
            } else if (promedios[i] >= 6) {
                promcuant = "Bueno";
            } else {
                promcuant = "Regular";
            }
            System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio cuantitativo: " + promcuant);

        }
    }
}
/**
 * Kimberly Gonzalez promedio: 10.0 promedio cuantitativo: Sobresaliente
   Mark Hogan promedio: 10.0 promedio cuantitativo: Sobresaliente
   Teresa Martinez promedio: 9.1 promedio cuantitativo: Sobresaliente
   Julia Johnson promedio: 7.0 promedio cuantitativo: Bueno
   Mark Cook promedio: 6.1 promedio cuantitativo: Bueno
   Jennifer Manning promedio: 4.0 promedio cuantitativo: Regular
   Juan Vasquez promedio: 8.0 promedio cuantitativo: Bueno
 */
