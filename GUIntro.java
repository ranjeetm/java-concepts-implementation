import javax.swing.JOptionPane;
public class GUIntro {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your Name:");
		JOptionPane.showMessageDialog(null,"Hello : "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age:"));
		JOptionPane.showMessageDialog(null,"Your Age is "+age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height:"));
		JOptionPane.showMessageDialog(null,"Your Height is "+height+"cm");
	}

}
