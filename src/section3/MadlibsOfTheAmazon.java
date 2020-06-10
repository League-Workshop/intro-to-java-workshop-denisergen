package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it");
		// Get the user to enter an adjective
		String JA = JOptionPane.showInputDialog("Gimme a adjective");
		// Get the user to enter a type of liquid
		String JB = JOptionPane.showInputDialog("Gimme a liquid");
		// Get the user to enter a body part
		String JC = JOptionPane.showInputDialog("Gimme a body part");
		// Get the user to enter a verb
		String JD = JOptionPane.showInputDialog("Gimme a verb");
		// Get the user to enter a place
		String JE = JOptionPane.showInputDialog("Gimme a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "First you take a " +JA+
				" twig and dip it in " +JB+
				" then rip off your " + JC +
				" and\n " +JD+
				"  it onto your twig and pretend you are in " +JE+
				" as you jump into piranha infested waters!!\n Happy swiming!" );

	}
}

