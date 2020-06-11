package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHp = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHp = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDmg = 11;
		int playerCrit = 40;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDmg = 20;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHp>0 && dragonHp>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
			String fight = JOptionPane.showInputDialog("yell or kick");
		// 9. If they typed in "yell":
		if( fight.equalsIgnoreCase("yell")) {
			Random rand = new Random();
			int random = rand.nextInt(4);
			
			String message = "";

			if (random == 0) {
				message = "11 damage";
				dragonHp-= playerDmg;
			}

			if (random == 1) {
				message = "You missed!";
			}

			if (random == 2) {
				message = "11 damage";
				dragonHp-= 11;
			}
			if (random == 3) {
				message = "Critical hit! 40 damage";
				dragonHp-= 40;
			}
			JOptionPane.showMessageDialog(null, message);
			
		}
		if( fight.equalsIgnoreCase("kick")) {
			Random rand = new Random();
			int random = rand.nextInt(4);
			
			String message = "";

			if (random == 0) {
				message = "Critical hit! 40 damage";
				dragonHp-= 40;
			}

			if (random == 1) {
				message = "You missed!";
			}

			if (random == 2) {
				message = "You missed";
			
			}
			if (random == 3) {
				message = "Critical hit! 40 damage";
				dragonHp-= 40;
			}
			JOptionPane.showMessageDialog(null, message);
			
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage

			Random rand = new Random();
			int random = rand.nextInt(4);
			
			String message = "";

			if (random == 0) {
				message = "Ouch! the dragon burned you!20 damage";
				playerHp-= 20;
			}

			if (random == 1) {
				message = "The dragon missed!";
			}

			if (random == 2) {
				message = "OH NO! the dragon hit you with its massive tail! 30 damage";
				playerHp-=30;
			
			}
			if (random == 3) {
				message = "Oof! the dragon clawed you!";
				playerHp-= 20;
			}
			
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
			if (playerHp <= 0) {
				message = "Darn! You lost the dragon got the princess!";
		
			}
		// 14. Else if the dragon's health is less than or equal to 0
			if (dragonHp <= 0) {
				message = "Congrats! The dragon was slain!";
		
			}
			
			JOptionPane.showMessageDialog(null, message);
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
		

	}}

