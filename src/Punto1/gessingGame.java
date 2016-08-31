/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author PC
 */
public class gessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        java.util.Scanner teclado = new java.util.Scanner (System.in);
        int answer;
        int numGuesses = 1;
        int guess = 0;
        answer = (int) (Math.random() * 100 + 1);
        

       

        while (guess!=answer) 
        {
            System.out.print("Enter your guess: ");
            guess = teclado.nextInt();

            if (numGuesses>7 || (guess == answer)) System.out.println("You loser");  
            else if (guess>answer) System.out.println("Higher...");
            else if (guess<answer) System.out.println("Lower...");
            else System.out.println("You win");
            numGuesses=numGuesses++;
        }

        System.out.println("Would you like to play again y/n?");
        String playAgain = teclado.next();
        while (!playAgain.equals ("y"))
        {
            if(!playAgain.equals("y"))   System.out.println("Bye ^-^");                     
        }
       
    }
    
}
