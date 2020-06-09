package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot jeff= new Robot();

        // 3. Put the robot's pen down

jeff.penDown();
        // 6. Make the robot move as fast as possible
jeff.setSpeed(9001);

        // 5. Use a for loop to repeat everything below 4 times. 
for (int i=0; i<200; i++) {
	jeff.setRandomPenColor();
	jeff.setSpeed(90001);
	jeff.move(100);
	jeff.turn(89);
	}

        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right

    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}
