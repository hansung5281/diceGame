package diceGame;

public class Dice {
	private int diceNumber;
	
	public Dice(){
		setNumber();
	}
	
	public void setNumber(){
		diceNumber = (int)((Math.random()*10)%6+1);
	}
	
	public int getNumber(){
		return this.diceNumber;
	}
	
}
