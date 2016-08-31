/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class TiendadeLibros {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
        {
            
            System.out.println("Detalle del catálogo");
            System.out.println("ISBN              Titulo                Precio ");
            int Algoritmia[]= new int[2];
            
            String Libro1 = "Algoritmia y Programación";
            Algoritmia[0]= 123876653 ;
            Algoritmia[1]= 57000;
            
            String Libro2= "Programación en Java";
            int Programacion[]= new int[2];
            Programacion[0]= 345980343;
            Programacion[1]= 75000; 
             
            //Libro Disponibles
            String Libro3 = "El Lenguaje UML";
            int UML[]= new int[2];
            UML[0]= 908654873;
            UML[1]= 43500;
            
            String Libro4= "Usando jUnit";
            int jUnit[] = new int[3];
            jUnit[0]=243865443;
            jUnit[1]=63092;
            
            String Libro5= "Programación en C#";
            int csharp[] = new int[2];
            csharp[0]= 877765343;
            csharp[1]= 65432;
            
            //Libros Comprados
            String titulo1 = "";
            String titulo2 = "";
            String titulo3 = "";
            String titulo4 = "";
            String titulo5 = "";
            
            int compraLibro1[]= new int[3];
            //[0] codigo
            //[1] Precio
            //[2] Cantidad
            //[3] Cantidad*precio
            int compraLibro2[]= new int[3];
            int compraLibro3[]= new int[3];
            int compraLibro4[]= new int[3];
            int compraLibro5[]= new int[3];
            
            boolean menu = true;
            int total=0;
            int subtotal1 =0;
            int subtotal2 =0;
            int subtotal3 =0;
            int subtotal4 =0;
            int subtotal5 =0;
            int cantidadTotal1 = 0;
            int cantidadTotal2 = 0;
            int cantidadTotal3 = 0;
            int cantidadTotal4 = 0;
            int cantidadTotal5 = 0;
            
            int fin= 0;
            
            
            Scanner leer = new Scanner(System.in);
            while(menu == true)
            {
                
                
            
                System.out.println("Detalle del catálogo");
                System.out.println("......................................................");
                System.out.println("ISBN                   Titulo                   Precio");
                System.out.println(Algoritmia[0]+"        "+Libro1+"      "+Algoritmia[1]);
                System.out.println(Programacion[0]+"        "+Libro2+"           "+Programacion[1]);
                System.out.println(UML[0]+"        "+Libro3+"                "+UML[1]);
                System.out.println(jUnit[0]+"        "+Libro4+"                   "+jUnit[1]);
                System.out.println(csharp[0]+"        "+Libro5+"             "+csharp[1]);
                System.out.println("");
                System.out.println("Detalle del carrito de compras");
                System.out.println("....................................................................");
                System.out.println("ISBN                   Titulo                                                    Cantidad          Subtotal");
                System.out.println(compraLibro1[0]+"              "+titulo1+"                                 "+cantidadTotal1+"                 "+subtotal1);
                System.out.println(compraLibro2[0]+"              "+titulo2+"                                      "+cantidadTotal2+"                 "+subtotal2);
                System.out.println(compraLibro3[0]+"              "+titulo3+"                                           "+cantidadTotal3+"                 "+subtotal3);
                System.out.println(compraLibro4[0]+"              "+titulo4+"                                              "+cantidadTotal4+"                 "+subtotal4);
                System.out.println(compraLibro5[0]+"              "+titulo5+"                                        "+cantidadTotal5+"                 "+subtotal5);
                System.out.println("...........................................................................................................");
                System.out.println("                                                                                                     TOTAL ");
                System.out.println("                                                                                                     "+total);
                System.out.println("Opciones: ");
                System.out.println("1. Comprar");
                System.out.println("2. Borrar");
                System.out.print("Seleccione uno de los numeros correspients a las opciones: ");
                int opcion1 = leer.nextInt();
                int opcion2;
                switch(opcion1)
                    {   
                        case 1 :  System.out.println("");
                                  System.out.println("Seleccione el libro a comprar:");
                                  System.out.println("");
                                  System.out.println("1."+Libro1);
                                  System.out.println("2."+Libro2);
                                  System.out.println("3."+Libro3);
                                  System.out.println("4."+Libro4);
                                  System.out.println("5."+Libro5);
                                  System.out.print("Seleccione uno de los numeros correspients a las opciones: ");
                                  opcion2 = leer.nextInt(); 
                                  switch(opcion2)
                                  {
                                        case 1 : System.out.println("");
                                                 System.out.println(Libro1);
                                                 System.out.print("Seleccione cantidad a comprar:");
                                                 compraLibro1[2]= leer.nextInt();
                                                 compraLibro1[0]= Algoritmia[0];
                                                 titulo1 = Libro1;
                                                 subtotal1 = Algoritmia[1]*compraLibro1[2];
                                                 total = total +(Algoritmia[1]*compraLibro1[2]);
                                                 cantidadTotal1 = cantidadTotal1 + compraLibro1[2];
                                                 break;
                                                 
                                        case 2 : System.out.println("");
                                                 System.out.println(Libro2);
                                                 System.out.print("Seleccione cantidad a comprar:");
                                                 compraLibro2[2]= leer.nextInt();
                                                 compraLibro2[0]= Programacion[0];
                                                 titulo2 = Libro2;
                                                 subtotal2= Programacion[1]*compraLibro2[2];
                                                 total = total +(Programacion[1]*compraLibro2[2]);
                                                 cantidadTotal2= cantidadTotal2 + compraLibro2[2];
                                                 break;
                                                 
                                        case 3 : System.out.println("");
                                                 System.out.println(Libro3);
                                                 System.out.print("Seleccione cantidad a comprar:");
                                                 compraLibro3[2]= leer.nextInt();
                                                 compraLibro3[0]= UML[0];
                                                 titulo3 = Libro3;
                                                 subtotal3 = UML[1]*compraLibro3[2];
                                                 total = total + (UML[1]*compraLibro3[2]);
                                                 cantidadTotal3= cantidadTotal3 + compraLibro3[2];
                                                 break;
                                                 
                                        case 4 : System.out.println("");
                                                 System.out.println(Libro4);
                                                 System.out.print("Seleccione cantidad a comprar:");
                                                 compraLibro4[2]= leer.nextInt();
                                                 compraLibro4[0]= jUnit[0];
                                                 titulo4 = Libro4;
                                                 subtotal4 = jUnit[1]*compraLibro4[2];
                                                 total= total+(jUnit[1]*compraLibro4[2]);
                                                 cantidadTotal4= cantidadTotal4 + compraLibro4[2];
                                                 break;
                                                 
                                        case 5 : System.out.println("");
                                                 System.out.println(Libro5);
                                                 System.out.print("Seleccione cantidad a comprar:");
                                                 compraLibro5[2]= leer.nextInt();
                                                 compraLibro5[0]= csharp[0];
                                                 titulo5 = Libro5;
                                                 subtotal5 = csharp[1]*compraLibro5[2];
                                                 total= total + (csharp[1]*compraLibro5[2]);
                                                 cantidadTotal5= cantidadTotal5 + compraLibro5[2];
                                                 break;
                                                 
                                        default : System.out.println("Ingrese un valor valido");
                                                  
                                                 
                                                 
                              
                                  }
                                  break;
                    case 2 :      System.out.println("Seleccione el libro a borrar");
                                  System.out.println("");
                                  System.out.println("1."+Libro1);
                                  System.out.println("2."+Libro2);
                                  System.out.println("3."+Libro3);
                                  System.out.println("4."+Libro4);
                                  System.out.println("5."+Libro5);
                                  System.out.print("Seleccione uno de los numeros correspiente a las opciones: ");
                                  opcion2 = leer.nextInt(); 
                                  switch(opcion2)
                                  {
                                      case 1 : System.out.println("");
                                                 System.out.println(Libro1);
                                                 System.out.print("Seleccione la cantidad a borrar:");
                                                 compraLibro1[2]= leer.nextInt();
                                                 compraLibro1[0]= Algoritmia[0];
                                                 total = total - (Algoritmia[1]*compraLibro1[2]);
                                                 cantidadTotal1 = cantidadTotal1 - compraLibro1[2];
                                                 if(cantidadTotal1 == 0)
                                                 {
                                                     compraLibro1[0]= 0;
                                                     titulo1 = " ";
                                                     subtotal1 = 0;
                                                 }    
                                                 
                                                 break;
                                                 
                                        case 2 : System.out.println("");
                                                 System.out.println(Libro2);
                                                 System.out.print("Seleccione cantidad a borrar:");
                                                 compraLibro2[2]= leer.nextInt();
                                                 compraLibro2[0]= Programacion[0];
                                                 titulo2 = Libro2;
                                                 total = total -(Programacion[1]*compraLibro2[2]);
                                                 cantidadTotal2 = cantidadTotal2 - compraLibro2[2];
                                                 if(cantidadTotal2 == 0)
                                                 {
                                                     compraLibro2[0]= 0;
                                                     titulo2 = "";
                                                     subtotal2 = 0;
                                                 }
                                                 break;
                                                 
                                        case 3 : System.out.println("");
                                                 System.out.println(Libro3);
                                                 System.out.print("Seleccione cantidad a borrar:");
                                                 compraLibro3[2]= leer.nextInt();
                                                 compraLibro3[0]= UML[0];
                                                 titulo3 = Libro3;
                                                 total = total - (UML[1]*compraLibro3[2]);
                                                 cantidadTotal3 = cantidadTotal3 - compraLibro3[2];
                                                 if(compraLibro3[2] == 0)
                                                 {
                                                     compraLibro3[0]= 0;
                                                     titulo3 = "";
                                                     subtotal3 = 0;
                                                 }
                                                 break;
                                                 
                                        case 4 : System.out.println("");
                                                 System.out.println(Libro4);
                                                 System.out.print("Seleccione cantidad a borrar:");
                                                 compraLibro4[2]= leer.nextInt();
                                                 compraLibro4[0]= jUnit[0];
                                                 titulo4 = Libro4;
                                                 total= total-(jUnit[1]*compraLibro4[2]);
                                                 cantidadTotal4 = cantidadTotal4 - compraLibro4[2];
                                                 if(compraLibro4[2] == 0)
                                                 {
                                                     compraLibro4[0]= 0;
                                                     titulo4 = "";
                                                     subtotal4 = 0;
                                                 }
                                                 break;
                                                 
                                        case 5 : System.out.println("");
                                                 System.out.println(Libro5);
                                                 System.out.print("Seleccione cantidad a comprar:");
                                                 compraLibro5[2]= leer.nextInt();
                                                 compraLibro5[0]= csharp[0];
                                                 titulo5 = Libro5;
                                                 total= total - (csharp[1]*compraLibro5[2]);
                                                 cantidadTotal5 = cantidadTotal5 - compraLibro5[2];
                                                 if(compraLibro5[2] == 0)
                                                 {
                                                     compraLibro5[0]= 0;
                                                     titulo5 = "";
                                                     subtotal5 = 0;
                                                 }
                                                 break;
                                                 
                                        default : System.out.println("Ingrese un valor valido");
                                                  
                                                 
                                      
                                  }
                                  break;
                              
                    default : System.out.println("Seleccione una opcion valida");
                            
                
                }
            
                    
            System.out.println("¿Desea Continuar?");
            System.out.println("1. Si");
            System.out.println("2. No");
            fin = leer.nextInt();
            if(fin == 2) menu = false;
            }
            System.out.println("Gracias por su Compra.");  
        }
}
