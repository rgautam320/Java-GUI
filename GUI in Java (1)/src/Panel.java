import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon1 = new ImageIcon("basketball.png");
		ImageIcon icon2 = new ImageIcon("cricket.png");
		
		JLabel label1 = new JLabel();
		label1.setText("ICON");
		label1.setIcon(icon1);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel label2 = new JLabel();
		label2.setText("ICON");
		label2.setIcon(icon2);
		label2.setVerticalTextPosition(JLabel.TOP);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setBounds(100, 100, 250, 250);
		
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.RED);
		redpanel.setBounds(0, 0, 250, 250);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setLayout(new BorderLayout());
		bluepanel.setBounds(250, 0, 250, 250);
		
		JPanel yellowpanel = new JPanel();
		yellowpanel.setBackground(Color.YELLOW);
		yellowpanel.setBounds(500, 0, 250, 250);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.GREEN);
		greenpanel.setBounds(0, 250, 750, 500);
		greenpanel.setLayout(null);
		
		
		JFrame frame =  new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(yellowpanel);
		frame.add(greenpanel);
		
		bluepanel.add(label1);
		greenpanel.add(label2);
		
		frame.setSize(750,750);
		frame.setVisible(true);
	}
}
