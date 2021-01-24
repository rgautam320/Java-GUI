import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ImageIcon imageIcon = new ImageIcon("cricket.png");
		
		frame.setTitle("Frame in GUI JAVA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(imageIcon.getImage());
		frame.setResizable(true);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setIconImage(imageIcon.getImage());
		frame.pack();
		frame.setSize(300, 250);
		frame.setVisible(true);
	}
}
