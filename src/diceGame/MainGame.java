package diceGame;

import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {
		
		String playerDice1 = null,
			   playerDice2 = null;
		
		//player 등록
		Judge judge = new Judge();
		judge.setPlayer();

		
		//
		int choice;
		
		
		
		int diceNumber1,
			playerNumber2;
		
		String diceChoice; 
		
		Scanner scanner = new Scanner(System.in);
		
		//선수주사위 선택
		/*********************************************/
		
		System.out.println("1번 player");
		System.out.println("주사위를 고르시오.");
		System.out.println("1.주사위");
		System.out.println("2.사기 주사위");
		
		choice = scanner.nextInt();
		
		
		switch (choice) {
		case 1:
			playerDice1 = "nomal";
			break;
		case 2:
			playerDice1 = "fraud";
			break;
		default:
			break;
		}
		
		if("nomal".equals(playerDice1)){
			System.out.println("레벨을 고르시오");
			System.out.println("1.일반 2.약함 3.강함");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				playerDice1 = "fraudN";
				break;
			case 2:
				playerDice1 = "fraudW";
				break;
			case 3:
				playerDice1 = "fraudS";
				break;
			default:
				break;
			}
			
		}
		
		
		/*********************************************/

		
		Dice dice = new Dice();
		
		
	}
}
