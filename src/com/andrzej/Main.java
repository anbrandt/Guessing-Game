package com.andrzej;

import java.util.Random;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		//player vs cpu
	HumanPlayer humanPlayer = new HumanPlayer();
	humanPlayer.humanVScpu();


		//cpu vs player using binary search
	CPUPlayer cpuPlayer = new CPUPlayer();
	cpuPlayer.cpuVShuman();




	}


}
