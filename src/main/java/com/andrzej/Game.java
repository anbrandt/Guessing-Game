package com.andrzej;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andrzej on 08.06.17.
 */
public class Game {

	public void gameStart() {


		String answerFromUser = initialMessages();

		try {

			if (answerFromUser.equals("h")) {

				HumanPlayer humanPlayer = new HumanPlayer();
				humanPlayer.humanVScpu();
				gameStart();

			} else if (answerFromUser.equals("c")) {

				CPUPlayer cpuPlayer = new CPUPlayer();
				cpuPlayer.cpuVShuman();
				gameStart();

			} else if (answerFromUser.equals("exit")) {
				System.out.println("End of the program");

			} else {
				System.out.println("You have to choose between the h, c or exit");
				gameStart();
			}


		} catch (InputMismatchException e) {
			e.getMessage();
			System.out.println("You have to press either h or c");
			gameStart();
		}
	}


	public String initialMessages () {
		System.out.println("Human vs CPU - press h");
		System.out.println("CPU vs human - press c");
		System.out.println("Write exit to exit");


		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		return answer;
	}
}



