import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Name: Wayland Carter
// Date: 7/17/2020
// Midterm - GuessTheNumber

public class GuessTheNumber
{
	public static void main(String[] args)
	{
		String answer = "Y";
		int number, guessAmount = 0, totalGuesses = 0, played = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		
		int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
		
		while(answer == "Y" || answer == "y")
		{
			System.out.print("Guess a number (between 1 and 100): ");
			number = input.nextInt();
			guessAmount++;
			
			while(number != randomNum)
			{
				if(number < randomNum)
				{
					System.out.print("Too low guess again: ");
					number = input.nextInt();
					guessAmount++;
				}
				else if(number > randomNum)
				{
					System.out.print("Too high guess again: ");
					number = input.nextInt();
					guessAmount++;
				}
			}
			System.out.printf("Winner!! You guessed the secret number of %d in %d guesses.", randomNum, guessAmount);
			played++;
			totalGuesses += guessAmount;
			
			System.out.print("\n\nDo you wish to play again?(Y/N)");
			answer = input.nextLine();
			input.close();
		}
		System.out.printf("\nYou played %d games.", played);
		average = (double) totalGuesses / played;
		System.out.printf("\nYou had %d total guesses and average %.2f guesses per game.", totalGuesses, average);
	}
}
