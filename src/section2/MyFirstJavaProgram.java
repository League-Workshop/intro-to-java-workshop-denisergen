package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot jeff=new Robot();	
jeff.setSpeed(9001);
jeff.move(250);
jeff.turn(90);
jeff.move(250);
jeff.turn(90);
		jeff.penDown();
		jeff.setPenColor(Color.pink);
		for (int i=0; i<30; i++) {
		jeff.setSpeed(9001);
		jeff.move(25);
		jeff.turn(25);
		}
		
	}
}
