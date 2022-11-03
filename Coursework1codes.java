package Courseworkpackage;
import java.util.Scanner;
public class Coursework1codes {

//	private static final boolean OutOfGuesses = false;

	public static void main(String[] args) {
	
Scanner keyboardInput=new Scanner(System.in); 
String secretword ="javascript";
String guess ="";
int guesscount =0;
int guessinglimit =5;
boolean OutOfGuesses= false;


while(!guess.equals(secretword) && !OutOfGuesses){
	
	if(guesscount <guessinglimit) {
	
	System.out.print("Enter a guess:");
	guess =keyboardInput.nextLine();
	guesscount++;
	
} else {
	OutOfGuesses = true;
}
 
}

if(OutOfGuesses) {
	System.out.println("when you fail! no more guesses");
}else {
	System.out.println("Right Guess");
	
}

	}

}
