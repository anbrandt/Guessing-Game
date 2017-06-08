package com.andrzej;

import java.util.Scanner;

/**
 * Created by andrzej on 08.06.17.
 */
public class Game {

public void gameStart () {

	System.out.println("Human vs CPU - press h");
	System.out.println("CPU vs human - press c");

	Scanner scanner = new Scanner(System.in);
	String answer = scanner.next();

	if (answer.equals("h")) {
		HumanPlayer humanPlayer = new HumanPlayer();
		humanPlayer.humanVScpu();
	} else if (answer.equals("c")) {
		CPUPlayer cpuPlayer = new CPUPlayer();
		cpuPlayer.cpuVShuman();
	} else {
		System.out.println("you have to choose between 'h' and 'c'");
	}


}


}
