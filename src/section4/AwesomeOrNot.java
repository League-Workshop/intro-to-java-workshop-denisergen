package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…

	public static void main(String[] args) {

		Random rand = new Random();
		int random = rand.nextInt(4);

		String HAHA = JOptionPane.showInputDialog("Gimme somthing you think is awesome");
		String message = "";

		if (random == 0) {
			message = "LAMEEEEEEEEE";
		}

		if (random == 1) {
			message = "EWWWWWWWWWWWWWWWW";
		}

		if (random == 2) {
			message = "UGHHHHHHHHHHHH";
		}
		if (random == 3) {
			message = "GETTTTTT THAT OUT OF HERE";
		}
		JOptionPane.showMessageDialog(null, message);

		// Random rand = new Random();fe
		// int random = rand.nextInt(5);

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		// new Random(cow).nextInt(4)
		// 3. Print out this variable
		// JOptionPane.showMessageDialog(null, );
		// 4. Get the user to enter something that they think is awesome

		// 5. If the random number is 0

		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1

		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2

		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3

		// -- write your own answer

	}
}
