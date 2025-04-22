package day5;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rock, Paper, Scissors game!");
		
		System.out.println("Enter your choice:");
		System.out.println("Rock:0, Paper:1, Scissor:2");
		
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		
		if (userChoice < 0 || userChoice > 2) {
			System.out.println("Invalid choice");
			return;
		}
		
		int computerChoice = (int)(Math.random() * 3);
		System.out.println("Computer's choice is " + computerChoice);
		
		if (userChoice == computerChoice) {
			System.out.println("It's a tie.");
		}
		else if (userChoice == 0 && computerChoice == 1 ||
			userChoice == 1 && computerChoice == 0 ||
			userChoice == 2 && computerChoice == 2)
			System.out.println("You win.");
		else
			System.out.println("Computer win.");
		
		scanner.close();

	}

}
