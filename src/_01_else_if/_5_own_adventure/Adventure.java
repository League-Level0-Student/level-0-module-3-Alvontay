package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "there once was a boy who wanted to bake a cake");
		String flavor = JOptionPane.showInputDialog("should he make a chocolate cake or a vanilla cake");
		if (flavor .equalsIgnoreCase("chocolate")) {
			JOptionPane.showMessageDialog(null, "he decided on a chocolate cake and then made it and everyone was happy :)");
		} else if (flavor .equalsIgnoreCase("vanilla")) {
			JOptionPane.showMessageDialog(null, "he decided on making a vanilla cake and some people liked it but others wanted chocolate :(");
		} else {
			JOptionPane.showMessageDialog(null, "he wanted a " + flavor + " cake, but he didnt have the "
												+ "ingrediants, so he was sad and his guests didnt get any cake :(");
		}
	}
}
