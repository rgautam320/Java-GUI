import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class New_Window {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	
	New_Window()
	{
		label.setText("Hello, this is new window");
		label.setBounds(100, 100, 300, 50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		frame.add(label);
		
		frame.setVisible(true);
	}

}
