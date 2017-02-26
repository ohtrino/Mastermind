package dafault;

import java.util.Random;
import java.util.Scanner;

public class Mastermind{
	

	public static void main(String[] args) {

		
		//Generate A Secret Code
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//NUMBER OF GUESSES
		int numberOfGuesses = 4;
		
		
		int  n = rand.nextInt(6) + 1;
		int m = rand.nextInt(6) + 1;
		int p = rand.nextInt(6) + 1;
		int q = rand.nextInt(6) + 1;
		
// IF YOU WANT TO SEE WHAT THE VALUES ARE UNCOMMENT:	
//		System.out.println(n); 
//		System.out.println(m); 
//		System.out.println(p); 
//		System.out.println(q); 
		
		
		
		System.out.println("Mastermind: Try and guess the four digit code.\n\n If a number you guessed is in the code you will see a + only if it is in the correct location.\n Otherwise you will see a -, which indicates a number you guessed is in the wrong position.\n If the number you guessed is not in the code then it will be left blank.\n Each digit of the code is between 1 and 6.");
		
		   
		   
		   while(numberOfGuesses>=0){
			   
			   if(numberOfGuesses==0){
				   System.out.println("Do you want to quit? yes or no");
				    String input = scanner.next();
				    if(input.equals("no")){
				    	System.out.println("How Many Lives Do You Want?");
					    String input2 = scanner.next();
					    numberOfGuesses=Integer.parseInt(input2);
				    }
			   }
			   
			   System.out.println("\nATTEMPTS REMAINING: "+numberOfGuesses+"\nGuess Below:\n");
			   String name = scanner.next();
				 String[] guess = name.split("");
				 
//				    System.out.println("Your favorite color is: " + guess[0]+guess[1]+guess[2]+guess[3]);
				    
				   
// THIS IS THE PART WHERE THE GUESS IS CHECKED
				 
				    String nCheck;
				    String mCheck;
				    String pCheck;
				    String qCheck;
				    
				   if(Integer.parseInt(guess[0])== n){
					  nCheck = "+";
				   } else if(Integer.parseInt(guess[0])== m || Integer.parseInt(guess[0])== p || Integer.parseInt(guess[0])== q ){
					    nCheck = "-";
				   } else {
					   nCheck = " ";
				   }
				   
				   if(Integer.parseInt(guess[1])== m){
					   mCheck = "+";
				   } else if(Integer.parseInt(guess[1])== n || Integer.parseInt(guess[1])== p || Integer.parseInt(guess[1])== q ){
					   mCheck= "-";
				   } else {
					   mCheck = " ";
				   }
				   
				   if(Integer.parseInt(guess[2])== p){
					   pCheck = "+";
				   } else if(Integer.parseInt(guess[2])== m || Integer.parseInt(guess[2])== n || Integer.parseInt(guess[2])== q ){
					   pCheck = "-";
				   } else {
					   pCheck = " ";
				   }
				   
				   if(Integer.parseInt(guess[3])== q){
					   qCheck = "+";
				   } else if(Integer.parseInt(guess[3])== m || Integer.parseInt(guess[3])== p || Integer.parseInt(guess[3])== n ){
					   
					   qCheck = "-";
				   } else {
					   qCheck = " ";
				   }
				   
				   System.out.println(nCheck + mCheck + pCheck + qCheck);
				   
				   if(nCheck=="+" && mCheck=="+" && pCheck=="+" && qCheck=="+" ){
					   System.out.println("CONGRATULATIONS. YOU WON");
					   numberOfGuesses=0;
				   } else if(numberOfGuesses==0){
					   System.out.println("Do you want to quit? yes or no");
					    String input = scanner.next();
					    if(input.equals("no")){
					    	System.out.println("How Many Lives Do You Want?");
						    String input2 = scanner.next();
						    numberOfGuesses=Integer.parseInt(input2);
					    }
				   }
				   
				   else if(numberOfGuesses == 1) {
					   System.out.println("Sorry. You Have Lost");
					   numberOfGuesses=0;
				   } else {
					   numberOfGuesses--;
				   }
			   
		   }
		   
		   

	   
	}
}