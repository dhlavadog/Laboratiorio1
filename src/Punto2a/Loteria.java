/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2a;

/**
 *
 * @author Diego, Juan, Juliana.
 */
import java.util.Scanner;
public class Loteria 
{

    /**
     * @param args the command line arguments
     */
    
    
    static int numerosGanadores()
    {
        int numero;
        numero = (int) (Math.random() * 9 + 1);
            
        return numero;
    }
    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int award = 0;
        String fin ="";
        int aciertos =0;
        boolean menu = true;
        int i = 0;
        int numUsuario[]= new int[3];
        int numGanador[]= new int[3];
        
        while(menu == true)
        {
            
            System.out.println("\nJuego de Loteria");
            System.out.println("................................");
            System.out.println("Numeros Acertados             Recompensa($)");
            System.out.println("Un acierto                               10");
            System.out.println("Dos aciertos                            100");
            System.out.println("Tres aciertos, sin orden               1000");
            System.out.println("Tres aciertos, en orden exacto    1'000.000");
            System.out.println("Ingrese 3 numeros: Solo del 0 al 9:");
        
            numUsuario[0] = leer.nextInt();
            numUsuario[1] = leer.nextInt();
            numUsuario[2] = leer.nextInt();
            
            if(numUsuario[0]>9 || numUsuario[1]>9 || numUsuario[2]>9)
            {
                System.out.println("\nLos numeros ingresados no pueden ser "
                + "mayores a 9");
            }
                
        
            while(i < 3 )
            {
                numGanador[i] = numerosGanadores();
                i++;   
            }
        
            System.out.println("Numeros acertados:");
            if(numUsuario[0] == numGanador[0] && numUsuario[1] == numGanador[1] 
              && numUsuario[1] == numGanador[2])
            {
                System.out.println("FELICIDADES!!");
                System.out.println("Has ganado el premio maximo");
                award = 1000000;
            }
                
            if( numUsuario[0] == numGanador[0] || numUsuario[0] == numGanador[1] 
                || numUsuario[0] == numGanador[2])
            {
                aciertos++;
                System.out.print(numUsuario[0]+" ");
            }
            if( numUsuario[1] == numGanador[0] || numUsuario[1] == numGanador[1] 
            || numUsuario[1] == numGanador[2])
            {
                aciertos++;
                System.out.print(numUsuario[1]+ " ");
            }
        
            if( numUsuario[2] == numGanador[0] || numUsuario[2] == numGanador[1] 
             || numUsuario[2] == numGanador[2])
            {
                aciertos++;
                System.out.println(numUsuario[2]+ " ");
            }
            
            if(aciertos == 1) award = award + 10;
            if(aciertos == 2) award = award + 100;
            if(aciertos == 3) award = award + 1000;
            if(aciertos == 0) System.out.println("Ninguno.");
            
            System.out.println("\nRecompensa: $"+award);
            System.out.print("¿Desea Intentarlo de nuevo? Si/No:");
            fin = leer.next();
            if(fin.equals("No") || fin.equals("no")) menu = false;
            else if(fin.equals("Si") || fin.equals("si"))
            {
                aciertos =0;
                award = 0;
            }
            
        
        }
        System.out.println("Gracias por Jugar");
      
    }
    
}
