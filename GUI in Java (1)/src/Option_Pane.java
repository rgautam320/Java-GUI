import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Option_Pane {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "This is some useless message", "Useless", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "Useless", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless question", "Useless", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless warning", "Useless", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless error", "Useless", JOptionPane.ERROR_MESSAGE);
	
		//JOptionPane.showConfirmDialog(null, "Do you even know coding?","Title", JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println(JOptionPane.showConfirmDialog(null, "Do you even know coding?","Title", JOptionPane.YES_NO_CANCEL_OPTION));
	
		//String nameString = JOptionPane.showInputDialog("What is your name?");
		//System.out.println("Name: "+ nameString);
		
		ImageIcon icon = new ImageIcon("tennisball.png");
		
		String[] responseStrings = {"No, you are awesome", "Thank you", "Blush"};
		
		JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responseStrings, 0);
	}

}
