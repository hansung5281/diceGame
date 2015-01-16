package diceGame;

import java.util.Scanner;

public class Judge {

	String playerDice1,
		   playerDice2,
		   playerName1,
		   playerName2;
	
	int playCount,
		diceChoice;
	
	Scanner scanner = new Scanner(System.in);
	
	public void setPlayer(){
		registerName();
		registerDice();
		registerPlayCount();
	}


	public void getPlayer(){
		
	}
	
	public void registerName(){
		System.out.println("Player의 이름을 입력해주세요.");
		playerName1 = scanner.next();
	}
	
	
	public String registerDice(){
		System.out.println("주사위를 고르시오.");
		System.out.println("1.주사위");
		System.out.println("2.사기 주사위");
		diceChoice = scanner.nextInt();
			
		choiceDice();	
		
		if("fraud".equals(playerDice1)){
			choiceFraudDice();
		}
		return playerDice1;
	}

	public void choiceFraudDice() {
		System.out.println("레벨을 고르시오");
		System.out.println("1.일반 2.약함 3.강함");
		diceChoice = scanner.nextInt();
		
		switch (diceChoice) {
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

	public void choiceDice() {
		switch (diceChoice) {
		case 1:
			playerDice1 = "nomal";
			break;
		case 2:
			playerDice1 = "fraud";
			break;
		default:
			break;
		}
	}
	
	public int registerPlayCount(){
		System.out.println("주사위를 몇번 던지시겠 습니까?");
		return playCount;
	}

}
