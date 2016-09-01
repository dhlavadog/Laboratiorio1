/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2c;

/**
 *
 * @author Diego.
 */
import java.util.Scanner;
public class Revista 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int edad;
        String genero= "";
        String estadoCivil;
        int ingresoAnual;
        int opcion[]= new int[2];
        boolean revista = true;
        int menordeveinte=0;
        int veinteNueve = 0;
        int treintaNueve = 0;
        int cuarentaNueve = 0;
        int cincuenta = 0;
        int m20 = 0,m29 = 0,m39 =0,m49 =0,m50=0; 
        int h20 = 0,h29 = 0,h39 =0,h49 =0,h50=0;
        int ingreso30 = 0,ingreso49=0,ingreso69=0,ingreso70=0;
        
        Scanner leer =  new Scanner(System.in);
        while(revista == true)
        {
            System.out.println("BIENVENIDO A DAILY LIFE MAGAZINE");
            System.out.println("................................\n");
            System.out.println("Registro de Usuarios:\n");
            System.out.print("Ingrese su Edad:");
            edad= leer.nextInt();
            if(edad<20) menordeveinte++;
            if(edad>=20 && edad<=29) veinteNueve++;
            if(edad>=30 && edad<=39) treintaNueve++;
            if(edad>=40 && edad<=49) cuarentaNueve++;
            if(edad>=50) cincuenta++;
            System.out.println("¿Es usted hombre o mujer?");
            genero = leer.next();
            if(edad<20 && genero.equals("mujer")) m20++;
            if(edad<20 && genero.equals("hombre")) h20++;
            if(edad>=20 && edad<=29 && genero.equals("mujer")) m29++;
            if(edad>=20 && edad<=29 && genero.equals("hombre")) h29++;
            if(edad>=30 && edad<=39 && genero.equals("mujer")) m39++;
            if(edad>=30 && edad<=39 && genero.equals("hombre")) h39++;
            if(edad>=40 && edad<=49 && genero.equals("mujer")) m49++;
            if(edad>=40 && edad<=49 && genero.equals("hombre")) h49++;
            if(edad>=50 && genero.equals("mujer")) m50++;
            if(edad>=50 && genero.equals("hombre")) h50++;
            System.out.println("¿Cual es su Estado Civil?");
            estadoCivil = leer.next();
            System.out.println("digite su ingreso Anual");
            ingresoAnual = leer.nextInt();
            if(ingresoAnual <30000) ingreso30++;
            if(ingresoAnual >=30000 && ingresoAnual <=49999) ingreso49++;
            if(ingresoAnual >=50000 && ingresoAnual <=69999) ingreso69++;
            if(ingresoAnual >=70000) ingreso70++;
            System.out.println("¿Que desea hacer?");
            System.out.println("1.Ingresar datos de otro lector");
            System.out.println("2.Hacer recuento de lectores");
            System.out.println("3.Finalizar");
            System.out.print("Ingrese un numero correspondiente a las opciones del menu:");
            opcion[0]= leer.nextInt();
            switch(opcion[0])
            {
                case 1 : revista = true;
                         break;
                
                case 2 : System.out.println("RECUENTO DE LECTORES\n");
                         System.out.println("1.Por Edad");
                         System.out.println("2.Por Genero");
                         System.out.println("3.Por Ingreso Anual");
                         System.out.print("Ingrese un numero correspondiente a las opciones del menu:");
                         opcion[1]= leer.nextInt();
                         switch(opcion[1])
                         {
                             case 1 : System.out.println("RECUENTO POR EDADES\n");
                                      System.out.println("Menor de 20: "+menordeveinte);
                                      System.out.println("entre 20-29: "+veinteNueve);
                                      System.out.println("entre 30-39: "+treintaNueve);
                                      System.out.println("entre 40-49: "+cuarentaNueve);
                                      System.out.println("Mayor a 50: "+cincuenta);
                                      break;
                             case 2 : System.out.println("RECUENTO POR GENERO\n");
                                      System.out.println(".....................");
                                      System.out.println("MUERES:");
                                      System.out.println("Menores de 20: "+m20);
                                      System.out.println("Entre 20 y 29: "+m29);
                                      System.out.println("Entre 30 y 39: "+m39);
                                      System.out.println("Entre 40 y 49: "+m49);
                                      System.out.println("Mayor a 50: "+m50);
                                      System.out.println("");
                                      System.out.println("HOMBRES");
                                      System.out.println("menores de 20: "+h20);
                                      System.out.println("entre 20 y 29: "+h29);
                                      System.out.println("Entre 30 y 39: "+h39);
                                      System.out.println("Entre 40 y 49: "+h49);
                                      System.out.println("Mayor a 50: "+h50);
                                      break;
                             case 3 : System.out.println("RECUENTO POR INGRESO ANUAL\n");
                                      System.out.println("menor a $30000: "+ingreso30);
                                      System.out.println("$30000-$49999: "+ingreso49);
                                      System.out.println("$50000-$69999: "+ingreso69);
                                      System.out.println("Mas de $70000: "+ingreso70);
                                      break; 
                             default : System.out.println("Ingrese un valor valido");
                         }
                    
                case 3 : revista = false;
                         break;
                         
                default : System.out.println("Ingrese un valor valido");
                          break;
            
            }  
        }
        
        System.out.println("Su sesion ha finalizado.");
    }  
}
