/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kleiv
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        int limite = 4;
        for (int i = 1; i <= limite; i++) {

            for (int j = i; j < limite; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/**
 * run:
   *
  ***
 *****
*******
 */