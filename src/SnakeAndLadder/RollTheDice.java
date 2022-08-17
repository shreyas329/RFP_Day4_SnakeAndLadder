package SnakeAndLadder;

public class RollTheDice {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and ladder problem...!");
		int startPosition = 0;
		int diceRoll = (int) (Math.random()*10)%6+1;
		System.out.println("Starting position is :"+startPosition);
		System.out.println("The dice number : "+diceRoll);
	}

}
