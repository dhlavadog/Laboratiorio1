/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2b;

/**
 *
 * @author Diego
 */

import java.util.Scanner;
public class JuegodeDados 
{

    /**
     * @param args the command line arguments
     */
    
    static int lanzamientoDados()
    {
       int dado = (int) (Math.random()*6+1);
       return dado;
    }
    
public static void main(String[] args) 
    
    {
        int puntaje = 0;
        int lanzar=0;
        int dado1Jugador = 0, dado2Jugador=0;
        int turnoJugador = 0;
        int totalJugador = 0;
        String decision = "";
        int dado1Maquina=0, dado2Maquina=0;
        int turnoMaquina = 0;
        int totalMaquina = 0;
        int i = 1;
        
        
        Scanner leer= new Scanner(System.in);
        
        while( totalJugador <101 || totalMaquina<101)
        {
            System.out.println("\nJUEGO DE DADOS\n");
            System.out.println("Turno Jugador");
            System.out.println("................");
            System.out.println("Precione 1 para lanzar dados");
            lanzar= leer.nextInt();
            dado1Jugador = lanzamientoDados();
            dado2Jugador = lanzamientoDados();
            System.out.println("Lanzamiento Dado 1:"+dado1Jugador);
            System.out.println("Lanzamiento Dado 2:"+dado2Jugador);
            if(dado1Jugador != 1 && dado2Jugador != 1)
            {
                turnoJugador= turnoJugador+dado1Jugador+dado2Jugador;
                System.out.println("¿Desea tirar los dados otra vez? Si/No");
                decision = leer.next();
                if(decision.equals("no")) totalJugador= turnoJugador;
                else 
                {
                   dado1Jugador = 0;
                   dado2Jugador = 0; 
                   
                }
                   
                 
            }
            
            else if(dado1Jugador == 1 || dado2Jugador == 1) turnoJugador =0;
            else if(dado1Jugador == 1 && dado2Jugador == 1) totalJugador =0;
             System.out.println("Puntaje Jugador = "+totalJugador);
             System.out.println("Puntaje Maquina = "+totalMaquina);
             System.out.println("\nTurno de la Maquina");
             System.out.println("................");
             dado1Maquina = lanzamientoDados();
             dado2Maquina = lanzamientoDados();
             System.out.println("Lanzamiento Dado 1:"+dado1Maquina);
             System.out.println("Lanzamiento Dado 2:"+dado2Maquina);
             
             if(dado1Maquina != 1 && dado2Maquina != 1)
               totalMaquina = dado1Maquina+dado2Maquina;
            else if(dado1Maquina == 1 || dado2Maquina == 1) turnoMaquina =0;
            else if(dado1Maquina == 1 && dado2Maquina == 1) totalMaquina =0;
             System.out.println("Final de la Ronda "+i+":");
             System.out.println("Puntaje Jugador = "+totalJugador);
             System.out.println("Puntaje Maquina = "+totalMaquina);
             System.out.println("Presione 1 para iniciar siguiente ronda");
             lanzar = leer.nextInt();
             i++;
             
             
         
            
        }
       if(totalJugador>totalMaquina) System.out.println("Has ganado!!");
       else if(totalJugador<totalMaquina) System.out.println("Tu pc te ha ganado");
       else if (totalJugador==totalMaquina) System.out.println("Hay un empate!!!");
    }
    
}
