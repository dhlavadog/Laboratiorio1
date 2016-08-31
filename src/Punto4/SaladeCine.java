/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author Diego Humberto Lavado Gonzalez
 */
import java.util.Scanner;
public class SaladeCine {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String filas = "";
        int columnas= 0;
        
        double caja = 0;
        int identidad;
        int sillas= 0;
        int recarga = 50000;
        boolean menu = true;
        int opcion[] = new int[4];
        String reservadas= "";
        while(menu == true)
        
        {
            
            System.out.println("......................MANEJO DE SALA DE CINE");
            System.out.println("");
            System.out.println("Total dinero en la caja: "+caja);
            System.out.println("");
            System.out.println("Sillas en Reserva:"+ reservadas);
            System.out.println("");
            System.out.println("1. Reserva");
            System.out.println("2. Pagar Reserva");
            System.out.println("3. Manejo de Tarjetas");
            System.out.print("Ingrese el numero correspondiente a una de las opciones: ");
            
            opcion[0] = leer.nextInt();
            switch(opcion[0])
            {
                case 1 : System.out.println("RESERVA:");
                         System.out.println("1. Eliminar");
                         System.out.println("2. Guardar Reserva");
                         System.out.println("3. Cargar Reserva");
                         opcion[1] = leer.nextInt();
                         switch(opcion[1])
                         {
                             case 1 : System.out.println("ELIMINAR");
                                      System.out.println("Ingrese documento");
                                      identidad = leer.nextInt();
                                      reservadas = "";
                                      System.out.println("");
                                      break;
                             case 2 : System.out.println("GUARDAR RESERVA");
                                      System.out.println("Ingrese documento");
                                      identidad = leer.nextInt();
                                      System.out.println("Seleccione Fila");
                                      filas = leer.next();
                                      System.out.println("Ingrese Columna");
                                      columnas = leer.nextInt();
                                      reservadas = reservadas +( filas+columnas)+" ";
                                      sillas++;
                                      break;
                             case 3 : System.out.println("");
                                      System.out.println("CARGAR RESERVA");
                                      System.out.println("");
                                      System.out.println("Ingrese documento");
                                      identidad = leer.nextInt();
                                      System.out.println("Sillas Reservadas: "+reservadas);
                                      System.out.println("Tarjeta TARCINE No."+identidad);
                                      
                                      
                                      
                                      
                                      
                         }
                         break;
                
                case 2 : System.out.println("PAGAR RESERVA:");
                         System.out.println("1. Pagar en Efectivo");
                         System.out.println("2. Pagar con Tarjeta");
                         opcion[1] = leer.nextInt();
                         switch(opcion[1])
                         {
                             case 1 : if(filas.equals("I") || filas.equals("J") || filas.equals("K")) caja = sillas*11000;  
                                      else caja = sillas*8000;
                                      break;
                             case 2 : if(filas.equals("I") || filas.equals("J") || filas.equals("K")) 
                                      caja = sillas*11000 - ((sillas*11000)*0.1);  
                                      else caja = sillas*8000 -((sillas*8000)*0.1) ;
                                      break;
                             
                                        
                         }
                         break;
                     
                case 3 : System.out.println("MANEJO DE TARJETAS:");
                         System.out.println("1. Crear Tarjeta");
                         System.out.println("2. Recargar Tarjeta");
                         opcion[1] = leer.nextInt();
                         switch(opcion[1])
                         {
                             case 1 : System.out.println("");
                                      System.out.println("CREAR TARJETA");
                                      System.out.println("Ingrese numero de documento");
                                      identidad = leer.nextInt();
                                      caja = caja + 70000;
                                      break;
                             case 2 : System.out.println("");
                                      System.out.println("RECARGAR TARJETA");
                                      System.out.println("");
                                      System.out.println("Ingrese el valor de la recarga");
                                      caja = caja + recarga;
                                      
                         }
                         break;
                       
                default :System.out.println("Ingrese una opcion valida");
                         break;
                          
            }
               
        }
       
        
    }
    
}
