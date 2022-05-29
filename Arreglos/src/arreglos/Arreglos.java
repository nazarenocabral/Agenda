
package arreglos;

import java.util.Scanner;


public class Arreglos {

  
    public static void main(String[] args) {
        
        String nombres[] = new String [8];
        Scanner teclado = new Scanner (System.in);
        
        for(int i = 0; i < nombres.length ; i++)
        {
            System.out.println("Cargue los nombres en el indice: " + i);
            nombres[i] = teclado.nextLine();
            
        }
        for(int i = 0; i < nombres.length ; i++)
        {
            System.out.println("En el indice : " + i + "tego el nombre: " + nombres[i]);
            
        }
        
    }
    
}
