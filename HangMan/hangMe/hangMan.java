/**********************************************
Workshop 1
Course:JAC444
Last Name:McGregor	
First Name:David
ID:147645170
Section:SAB
This assignment represents my own work in accordance with Seneca Academic Policy.
Date:2019/05/23
**********************************************/
package hangMe;

import java.util.Scanner;

public class hangMan {
	
	public static void main(String[] args) {

		int keepGoing = 0;
		Scanner read1 = new Scanner(System.in);
		
		if(!menuClass.wishToPlay(read1)) {return;}; //break out of program if false
		
		while(keepGoing != 1) {
		Scanner reader = new Scanner(System.in); //New Scanner Object
       	menuClass menu = new menuClass();
       	wordClass wordClass = new wordClass();
       	
       	
       	wordClass.hideWord();
		
        
       	while(wordClass.numberOfLetters != wordClass.hiddenWord.length()) {
       		wordClass.guessLetter(reader);
       	}
        
        keepGoing = menu.endGame(wordClass, reader);
		}
        
        
        
	}
}