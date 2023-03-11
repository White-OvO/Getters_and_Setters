package WAR;

import java.util.Random;
import java.util.Scanner;
//EACH PLAYER DRAWS CARD THAT HAVE POINTS VALUES OF 1 TO 13
//
//
//
//
//
//
//
//
//
public class WARGAME {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		String key;
		int randomCard, playerOneScore = 0, playerTwoScore = 0;
		for(int i = 0; i < 26; i++) {
			System.out.println("It is player one's turn(press a key and enter. if you want to end, type STOP") ;
			key = scan.nextLine();
			if(key.equals("STOP")) {
				break;
				
			}
			randomCard = generator.nextInt(13) +1;
			if (randomCard == 1) {
				System.out.println("You picked ace");
				playerOneScore = playerOneScore + 1;
				
			}else if(randomCard ==2) {
				System.out.println("You picked two");
				playerOneScore+=2;
				
			}else if(randomCard ==3) {
				System.out.println("You picked Three");
				playerOneScore+=3;
			
			}else if(randomCard ==4) {
				System.out.println("You picked Four");
				playerOneScore+=4;
			
			}else if(randomCard ==5) {
				System.out.println("You picked Five");
				playerOneScore+=5;
				
			}else if(randomCard ==6) {
				System.out.println("You picked Five");
				playerOneScore+=6;
				
			}else if(randomCard ==7) {
				System.out.println("You picked Seven");
				playerOneScore+=7;
				
			}else if(randomCard ==8) {
				System.out.println("You picked Eight");
				playerOneScore+=8;	
				
			}else if(randomCard ==9) {
				System.out.println("You picked Nine");
				playerOneScore+=9;
				
			}else if(randomCard ==10) {
				System.out.println("You picked Ten");
				playerOneScore+=10;
				
			}else if(randomCard ==11) {
				System.out.println("You picked Jack");
				playerOneScore+=11;	
				
			}else if(randomCard ==12) {
				System.out.println("You picked queen");
				playerOneScore+=12;	
			
			}else if(randomCard ==13) {
				System.out.println("You picked King");
				playerOneScore+=13;	
				
}
			System.out.println("It is player Two's turn (press a key and enter. if you want tol end, type STOP): ");
			key = scan.nextLine();
			if(key.equals("STOP")) {
					 System.out.println("Player one: " + playerOneScore);
					 System.out.println("player two: " + playerTwoScore);
					 break;
					 
}
			randomCard = generator.nextInt(13) + 1 ; //generates a random number from 1 to 13
			if(randomCard == 1 ) {
				System.out.println("You picked ace");
				playerTwoScore = playerOneScore + 1;
				
			}else if(randomCard == 2 ) {
				System.out.println("You picked Two");
				playerTwoScore+=2;
			
			}else if(randomCard == 3 ) {
				System.out.println("You picked Three");
				playerTwoScore+=3;			
				
			}else if(randomCard == 4 ) {
				System.out.println("You picked Four");
				playerTwoScore+=4;
			
			}else if(randomCard == 5) {
				System.out.println("You picked Five");
				playerTwoScore+=5;
				
			}else if(randomCard == 6 ) {
				System.out.println("You picked Six");
				playerTwoScore+=6;
			
			}else if(randomCard == 7 ) {
				System.out.println("You picked Seven");
				playerTwoScore+=7;
			
			}else if(randomCard == 8 ) {
				System.out.println("You picked Eight");
				playerTwoScore+=8;
			
			}else if(randomCard == 9 ) {
				System.out.println("You picked Nine");
				playerTwoScore+=9;
			
			}else if(randomCard == 10 ) {
				System.out.println("You picked Ten");
				playerTwoScore+=10;
				
			}else if(randomCard == 11 ) {
				System.out.println("You picked jack");
				playerTwoScore+=11;
			
			}else if(randomCard == 12 ) {
				System.out.println("You picked queen");
				playerTwoScore+=12;
				
			}else if(randomCard == 13 ) {
				System.out.println("You picked king");
				playerTwoScore+=13;
			
}
			System.out.println("Player one: " + playerOneScore);
			System.out.println("Player two: " + playerTwoScore);
}
if(playerOneScore > playerTwoScore) { 
	System.out.println("Player one wins");
	
}else if(playerOneScore < playerTwoScore) { 
	System.out.println("Player two wins");
}
else { 
	System.out.println("tie");
}
	}
		}