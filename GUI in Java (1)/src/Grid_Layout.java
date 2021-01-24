import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3, 3, 5, 5));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		
		
		frame.setVisible(true);

	}

}
