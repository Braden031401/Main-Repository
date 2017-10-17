package index;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

import FinalApplication.Game;

public class HighScore
{

	public static void main (String[]args){
	    Game guessing = new Game();
	    guessing.gameStart();

	}	

	
	
	public void start() {

	    System.out.println("Welcome to guessing game!"); 
	    System.out.println("Please enter the number between 1 and 1000");

	    Scanner input = new Scanner(System.in);
	    String y = "yes";
	    String n = "no";    
	    String playerName;
	    String currentGuess;
	     String quit = "quit";
	     int tries = 0;  //number of times player guessed
	     int guess = 0;  //number that player inputs
	     long startTime = System.currentTimeMillis();  //start timer after first guess
	     int randomNumber = (int) (Math.random() * 999 + 1); // generating random number
	     System.out.println(randomNumber);     // to be deleted after game is finished
	     currentGuess = input.nextLine();


	do{


	    if (currentGuess.matches("[0-9]+")) {  //if input is non-numeric value, show message
	        int numericInput = Integer.parseInt(currentGuess);
	    }
	    else {
	    System.out.println("You have enetered non-numeric value,please try again");
	    currentGuess = input.nextLine();
	    continue; //allows to enter non-numeric values multiple times without crash
	    }

	    guess = Integer.parseInt(currentGuess);


	    if(guess<1 || guess>1000 ){ //if the input number is out of range
	        System.out.println("The number is out of range! Please try again");
	        currentGuess = input.nextLine();
	        continue;
	    }

	    if (guess>randomNumber){
	        System.out.println("Oops,too high!");
	        currentGuess = input.nextLine();
	        tries++;
	    }
	    else if (guess<randomNumber){
	        System.out.println("Sorry, to low!");
	        currentGuess = input.nextLine();
	        tries++;
	    }



	    if(currentGuess.equalsIgnoreCase(quit)){
	        System.out.println("*****Thanx for playing! See you next time!*****");
	    }

	    if (guess==randomNumber){
	        tries++;
	        long endTime = System.currentTimeMillis();//stop the timer after number is guessed         correctly
	        long gameTime = endTime - startTime; //display game time after input number==random   number
	        System.out.println("Well done! You won the game in " + tries + " guesses " + "and " +    gameTime/1000 +  " seconds!");
	        System.out.println("Please enter your name: ");
	        playerName = input.nextLine();    //input for player name
	        System.out.println("Would you like to play again? y/n..."); 
	                currentGuess = input.nextLine();
	                }                              /*input for "yes" or "no".. 
	                                                  *MUST type "yes" or "no"! instead of "y" or   "n"!!*/

	    if (currentGuess.equalsIgnoreCase(n)){
	        System.out.println("******See you next time");

	    }

	    if (currentGuess.equalsIgnoreCase(y)) {
	        start();

	    }
	    }

	while(guess!=randomNumber && !currentGuess.equalsIgnoreCase(quit));  /*keep running the loop    until input
	                                                                 *equals random number, or until   input equals
	                                                                 * "quit" */


	}


}
