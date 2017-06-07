package com.andrzej;

import java.util.Scanner;

/**
 * Created by andrzej on 07.06.17.
 */
public class CPUPlayer {


	public static void main(String[] args) {

//player vs computer using binary search
		int numberOfTries = 0;
		int guessedNumber;
		Scanner input = new Scanner(System.in);

		String verifier;
		int begin = 0;
		int end = 1000;

		boolean win = false;

		while (win == false) {

			guessedNumber = (begin + end) / 2;
			System.out.println("Computer guessed " + guessedNumber + ". Is it the right one? ");
			numberOfTries++;
			verifier = input.next();


			if (verifier.equals("win")) {
				System.out.println("That is correct " + guessedNumber);
				System.out.println("Computer guessed the number after " + numberOfTries + " tries");
				win = true;

			} else if (verifier.equals("more")) {
				System.out.println("more");
				begin = guessedNumber + 1;

			} else if (verifier.equals("less")) {
				System.out.println("less");
				end = guessedNumber - 1;

			} else {
				System.out.println("Input has to be 'win', 'more' or 'less'");
				numberOfTries--; //so we dont add tries if i made a wrong input to scanner
			}

		}

	}

}
