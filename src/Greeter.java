import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Can you even?");
		JOptionPane.showMessageDialog(null,"I know your answer is, " + answer);
		JOptionPane.showMessageDialog(null,"I can read minds.");
		JOptionPane.showMessageDialog(null, "But you are wrong.");
		JOptionPane.showMessageDialog(null, "I am the only one who can close to evening.");
	}

}
