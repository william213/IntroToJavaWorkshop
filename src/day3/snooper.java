package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("what is you birthday?");

		String f = JOptionPane.showInputDialog("what was your first pet?");
		String t = JOptionPane.showInputDialog("what is your credit card # ?");
		JOptionPane.showMessageDialog(null, "I just figured out you instagram account and i going to kill  " + f);
	}

}
