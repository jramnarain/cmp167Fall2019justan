package week5;

import java.util.Scanner;
import java.util.Random;

public class lottogame {

	public static void main(String[] args) {
		double budget = 99.99;
		double ticketCost = 1.45;
		Scanner in = new Scanner(System.in);
		
		System.out.println("LottoGame is a game for you to play");
		System.out.printf("You have a budget of $%.2f to sped%n", budget);
		
		System.out.println("Would you like to play:?");
		String answer =  in.next();
		while(answer.equalsIgnoreCase("yes")){
			if( budget>=ticketCost) {
				budget = budget -ticketCost;
			System.out.println("you haved played!");
			System.out.printf(" You have $%.2f to spend%n", budget);
			
				if(play()) {
					System.out.printf("You won $%.2f%n",  ticketCost*2);
					budget += ticketCost*2;
					System.out.printf("You have $%.2f to spend%n", budget);
				}else {
					System.out.println("You lost ");
					
				}
			}
				else {
				System.out.println("Not enoughm money, Go Make money and come back");
				break;
			}
			System.out.println("Awesome, would you like to play again? Yes/No");
			answer=in.next();
			
		}
		System.out.println("OK, come back soon!");
		
	}
	public static boolean play() {
		Random rGen= new Random();
		int num = rGen.nextInt(2);
		
		return(num>0)? true:false;
	}
}
		
		
	

	
	
		
	
		
		
		
		 
	
		
			
