package SnakeAndLadder;

import java.util.*;

public class EnsureExactWin {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and ladder problem...!");
		Scanner read = new Scanner(System.in);
        int num = 0;
        int position = 0;
        int dice1;
        Random random = new Random();;
        System.out.println("The position  number is at 0 ");
        while (position < 100) {



            dice1 = random.nextInt(6) + 1;
            System.out.println("The player rolls dice " + dice1);
            int noplay = 0, ladder = 1, snake = 2;
            int dice2 = random.nextInt(3);
            System.out.println("check Condition : " + dice2);
            System.out.println("The position number is " +position);
            if (dice2 == noplay) {
                position = position + dice1;
                System.out.println("The position remain same at" + position);
                if (position >100) {
                    position = position - dice1;
                }

            }else if (dice2 == ladder) {
                position = position + dice1 + dice1;
                System.out.println("The position received ladder so move forward by " + position);
                if (position > 100) {
                    position = position - dice1-dice1;
                }
            } else {
                position = position - dice1;
                if (position < 0) {
                    position = 0;
                }
                System.out.println("The position received Snake so move backward by" + position);
            }

            System.out.println("The position number  is " + position);

        }
        if (position > 100) {
            position = 0;
        }

	}

}
