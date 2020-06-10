package section2;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("herro wrld");
	JOptionPane.showMessageDialog(null, "herro wrld");
	String name = JOptionPane.showInputDialog("GIVE ME YOUR NAME NOW");
			JOptionPane.showMessageDialog(null, "I SEE YOU "+ name);
}
}
