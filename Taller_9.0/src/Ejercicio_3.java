
public class Ejercicio_3 {
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
           for (int i = limite - 1; i >= 1; i--) {
            for (int j = limite; j > i; j--) {
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
 *****
  ***
   *
  */