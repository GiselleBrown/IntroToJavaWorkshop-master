import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("What is your name?");
		String b = JOptionPane.showInputDialog("What is your medical history?");
		String c = JOptionPane.showInputDialog("What is your greatest fear?");
		String d = JOptionPane.showInputDialog("What would be the worst way to die for you?");
		String e = JOptionPane.showInputDialog("Do you know kung fu?");
		String f = JOptionPane.showInputDialog("Or any type of self defence?");
		String g = JOptionPane.showInputDialog("Say if someone wanted to kill you, you know in a hypethetical situation, what would be the best way?");
		String h = JOptionPane.showInputDialog("Also hypithetically, where would you want your body to be dumped after you die?");
		String i = JOptionPane.showInputDialog("Do you think that people would look for you?");
		JOptionPane.showMessageDialog(null, "Thank you for filling out this survey for us. Your information is not safe with us. Have a good Day!");
	}

}
