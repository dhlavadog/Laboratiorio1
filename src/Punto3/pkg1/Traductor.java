package Punto3.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */

import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.io.*; 

public class Traductor 
{

    /**
     * @param args the command line arguments
     */

 

//metodo que traduce una palabra de español a ingles. Si la palabra no esta devuelve un string vacio 
private static String españolIngles(String palabra) throws Exception
{ 
    String traduccion = ""; 
    Scanner dicc = new Scanner( new File("EspañolIngles.txt")); 
    StringTokenizer token; 

    while(dicc.hasNext())
    { 
        token = new StringTokenizer(dicc.nextLine(), " : "); 
        if(token.nextToken( ).equals(palabra) )
            {
            traduccion = token.nextToken();
            }
             
    } 
return traduccion; 
} 

private static String españolFrances(String palabra) throws Exception
{ 
    String traduccion = ""; 
    Scanner dicc = new Scanner( new File("EspañolFrances.txt")); 
    StringTokenizer token; 

    while(dicc.hasNext())
    { 
        token = new StringTokenizer(dicc.nextLine(), " : "); 
        if(token.nextToken( ).equals(palabra) )
            {
            traduccion = token.nextToken();
          
            }
             
    } 
return traduccion; 
} 

private static String españolItaliano(String palabra) throws Exception
{ 
    String traduccion = ""; 
    Scanner dicc = new Scanner( new File("EspañolItaliano.txt")); 
    StringTokenizer token; 

    while(dicc.hasNext())
    { 
        token = new StringTokenizer(dicc.nextLine(), " : "); 
        if(token.nextToken( ).equals(palabra) )
            {
            traduccion = token.nextToken();
          
            }
             
    } 
return traduccion; 
} 



public static void main(String argv[])
{ 
    try
    {
        
        System.out.println("Traduccion Español - Ingles");
        Scanner texto = new Scanner(System.in); 
        String traduccion = new String(); 
    
        System.out.println("a que idioma desea traducir la frase");
        System.out.println("1. Ingles");
        System.out.println("2. Frances");
        System.out.println("3. Italiano");
        System.out.print("Escriba uno de los numeros correspondientes a las opciones: ");
        int opcion1= texto.nextInt();
        
        
        switch(opcion1)
                {
                    case 1 : 
                        System.out.println("Escriba la frase");
                        while(texto.hasNext())
                            {    
                                traduccion+= españolIngles(texto.next())+" ";
                                System.out.println("la traduccion es "+traduccion);                               
                            } 
                    break;
                    case 2 :
                        System.out.println("Escriba la frase");
                        while(texto.hasNext())
                            {    
                                traduccion+= españolFrances(texto.next())+" ";
                                System.out.println("la traduccion es "+traduccion);                               
                            }
                    break;
                    case 3 : 
                        System.out.println("Escriba la frase");
                        while(texto.hasNext())
                            {    
                                traduccion+= españolItaliano(texto.next())+" ";
                                System.out.println("la traduccion es "+traduccion);                               
                            }
                    break;
                    
                    default : System.out.println("Ingrese un valor valido");
                }
    




}

catch(Exception e)
    { 
        System.out.println(e.getMessage()); 
    } 
} 

    
}
