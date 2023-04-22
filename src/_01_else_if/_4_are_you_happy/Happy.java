package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Are you happy?");
		
		if (question.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
		} else {
			question = JOptionPane.showInputDialog("Do you want to be happy?");
			if (question .equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "then change something");
			} else {
				JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
			}
		}
	}
}
