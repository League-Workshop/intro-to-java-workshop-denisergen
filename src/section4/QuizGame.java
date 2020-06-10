package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String A = JOptionPane.showInputDialog("how many fingers do you have?");
		// 3.  Use an if statement to check if their answer is correct
		if (A.equalsIgnoreCase("10")) {
		score+= 1;
			
		}
		String B = JOptionPane.showInputDialog("How much is 1+1");
		if (B.equalsIgnoreCase("2")) {
			score+= 1;
				
			}
		String C = JOptionPane.showInputDialog("How muchfood is too much ");
		if (C.equalsIgnoreCase("alot")||(C.equalsIgnoreCase("a ton"))||(C.equalsIgnoreCase("too much"))) {
			score+= 1;
				
			}
		String message="";
		if (score==0 ) {message= "this is leo isnt it";}
		if (score==1 ) {message= "wow you are stupid";}
		if (score==2 ) {message= "nicee, but not perfect";}
		if (score==3 ) {message= "GENIUS";}
		JOptionPane.showMessageDialog(null, message );
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
