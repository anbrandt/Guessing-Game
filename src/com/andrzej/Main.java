package com.andrzej;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		//player vs computer
		Random randomNumber = new Random();

		//guess the number from 1 to 100
		int numberToGuess = randomNumber.nextInt(100);

		int numberOfTries = 0;

		int guessedNumber = 0;
		Scanner scanner = new Scanner(System.in);


		boolean win = false;

		System.out.println("You have to guess a number between 0 and 100");
		while (win == false) {
			guessedNumber = scanner.nextInt();
			numberOfTries++;

			if (guessedNumber == numberToGuess) {
				win = true;

			} else if (guessedNumber < numberToGuess) {
				System.out.println("Too low");
			} else {
				System.out.println("Too high");
			}
		}
		System.out.println("You win");
		System.out.println(numberOfTries);


	}


}
