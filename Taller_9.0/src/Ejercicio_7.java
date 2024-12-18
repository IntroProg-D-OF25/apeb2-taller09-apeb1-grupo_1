
public class Ejercicio_7 {
        public static void main(String[] args) {
        double[] notas = new double[28];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;  
        }
        
        double suma = 0;
        System.out.println("Notas de los estudiantes:");
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            System.out.printf("Estudiante %d: %.2f%n", i + 1, notas[i]); 
        }
        double promedio = suma / notas.length;
        System.out.println("\nEl promedio del curso es: " + promedio);

        int aprobados = 0;
        int reprobados = 0;

        System.out.println("\nEstudiantes que aprobaron:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedio) {
                aprobados++;
                System.out.printf("Estudiante %d: %.2f%n", i + 1, notas[i]);
            }
        }

        System.out.println("\nEstudiantes que reprobaron:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <= promedio) {
                reprobados++;
                System.out.printf("Estudiante %d: %.2f%n", i + 1, notas[i]);
            }
        }

        System.out.println("\nTotal de estudiantes que aprobaron: " + aprobados);
        System.out.println("Total de estudiantes que reprobaron: " + reprobados);

        double mejorNota = notas[0];
        double peorNota = notas[0];
        int mejorEstudiante = 0;
        int peorEstudiante = 0;

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                mejorEstudiante = i;
            }
            if (notas[i] < peorNota) {
                peorNota = notas[i];
                peorEstudiante = i;
            }
        }
        
        System.out.printf("%nLa mejor nota es %.2f y la tiene el estudiante %d.%n", mejorNota, mejorEstudiante + 1);
        System.out.printf("La peor nota es %.2f y la tiene el estudiante %d.%n", peorNota, peorEstudiante + 1);
    }
}
/**
 * run:
Notas de los estudiantes:
Estudiante 1: 5.96
Estudiante 2: 5.12
Estudiante 3: 0.47
Estudiante 4: 9.13
Estudiante 5: 8.70
Estudiante 6: 2.73
Estudiante 7: 5.35
Estudiante 8: 2.94
Estudiante 9: 1.08
Estudiante 10: 6.31
Estudiante 11: 2.82
Estudiante 12: 4.30
Estudiante 13: 5.03
Estudiante 14: 1.73
Estudiante 15: 3.10
Estudiante 16: 1.85
Estudiante 17: 9.09
Estudiante 18: 3.89
Estudiante 19: 1.82
Estudiante 20: 3.94
Estudiante 21: 5.35
Estudiante 22: 2.86
Estudiante 23: 3.01
Estudiante 24: 2.47
Estudiante 25: 3.18
Estudiante 26: 8.37
Estudiante 27: 2.48
Estudiante 28: 6.42

El promedio del curso es: 4.267677341575913

Estudiantes que aprobaron:
Estudiante 1: 5.96
Estudiante 2: 5.12
Estudiante 4: 9.13
Estudiante 5: 8.70
Estudiante 7: 5.35
Estudiante 10: 6.31
Estudiante 12: 4.30
Estudiante 13: 5.03
Estudiante 17: 9.09
Estudiante 21: 5.35
Estudiante 26: 8.37
Estudiante 28: 6.42

Estudiantes que reprobaron:
Estudiante 3: 0.47
Estudiante 6: 2.73
Estudiante 8: 2.94
Estudiante 9: 1.08
Estudiante 11: 2.82
Estudiante 14: 1.73
Estudiante 15: 3.10
Estudiante 16: 1.85
Estudiante 18: 3.89
Estudiante 19: 1.82
Estudiante 20: 3.94
Estudiante 22: 2.86
Estudiante 23: 3.01
Estudiante 24: 2.47
Estudiante 25: 3.18
Estudiante 27: 2.48

Total de estudiantes que aprobaron: 12
Total de estudiantes que reprobaron: 16

La mejor nota es 9.13 y la tiene el estudiante 4.
La peor nota es 0.47 y la tiene el estudiante 3.
 */
