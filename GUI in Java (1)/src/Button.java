import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Button in GUI Java");
		
		ImageIcon icon = new ImageIcon("wifi.png");
		ImageIcon icon2 = new ImageIcon("search.png");
		
		JButton button = new JButton();
		JLabel label = new JLabel();
		
		button.setBounds(100, 100, 350, 150);
		button.setText("I'm a Button");
		button.addActionListener(e -> label.setVisible(true));
		button.setFocusable(true);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setIconTextGap(-50);
		button.setBackground(Color.CYAN);
		button.setForeground(Color.BLACK);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		label.setIcon(icon2);
		label.setBounds(200, 350, 150, 150);
		label.setVisible(false);
		
		frame.add(button);
		frame.add(label);
		
		frame.setTitle("Frame in GUI JAVA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setVisible(true);

	}

}
