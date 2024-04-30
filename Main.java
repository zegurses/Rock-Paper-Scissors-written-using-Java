package mainPackage;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		
		int opponent = rn.nextInt(3);
		//System.out.println("Cheat - " + opponent + "\n");
		
		int r = 0;
		int p = 1;
		
		System.out.println("Rock - 0\nPaper - 1\nScissors - 2\nShoot");
		int choice = scan.nextInt();

		switch (choice) {
		case 0:
			System.out.println("You picked the Stone : " + choice + "\nYour opponent picked : " + opponent);
			
			if(opponent == r) System.out.println("It's a tie!");
			else if(opponent == p) System.out.println("You lost!");
			else System.out.println("You win!");
			break;
			
		case 1:
			System.out.println("You picked the Paper : " + choice + "\nYour opponent picked : " + opponent);

			if(opponent == r) System.out.println("You win!");
			else if(opponent == p) System.out.println("It's a tie!");
			else System.out.println("You lost!");			
			break;
			
		case 2:
			System.out.println("You picked the Scissors : " + choice + "\nYour opponent picked : " + opponent);
			
			if(opponent == r) System.out.println("You lost!");
			else if(opponent == p) System.out.println("You win!");
			else System.out.println("It's a tie!");			
			break;
			
		default:
			scan.close();
			throw new IllegalArgumentException("Invalid selection : " + choice);
		}
		
		scan.close();
	}
	
}
