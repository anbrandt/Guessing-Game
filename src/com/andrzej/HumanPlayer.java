package com.andrzej;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by andrzej on 08.06.17.
 */
public class HumanPlayer {
	

	private int numberOfTries = 0;

	private	int guessedNumber = 0;



	public void humanVScpu() {

		Random randomNumber = new Random();
		int numberToGuess = randomNumber.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		boolean win = false;

		System.out.println("You have to guess a number between 0 and 100");
		while (win == false) {
			guessedNumber = scanner.nextInt();
			numberOfTries++;

			if (guessedNumber == numberToGuess) {
				win = true;

			} else if (guessedNumber < numberToGuess) {
				System.out.println("more");
			} else {
				System.out.println("less");
			}
		}
		System.out.println("You win");
		System.out.println(numberOfTries);


	}


}



