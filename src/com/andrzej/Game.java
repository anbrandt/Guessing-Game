package com.andrzej;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andrzej on 08.06.17.
 */
public class Game {

	public void gameStart() {

		System.out.println("Human vs CPU - press h");
		System.out.println("CPU vs human - press c");
		System.out.println("Write exit to exit");

		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
//	boolean escapeTheLoop = false;

		try {

			if (answer.equals("h")) {

				HumanPlayer humanPlayer = new HumanPlayer();
				humanPlayer.humanVScpu();
				gameStart();

			} else if (answer.equals("c")) {

				CPUPlayer cpuPlayer = new CPUPlayer();
				cpuPlayer.cpuVShuman();
				gameStart();

			} else if (answer.equals("exit")) {
				System.out.println("End of the program");

			}


		} catch (InputMismatchException e) {
			e.getMessage();
			System.out.println("You have to press either h or c");
		}
	}
}



