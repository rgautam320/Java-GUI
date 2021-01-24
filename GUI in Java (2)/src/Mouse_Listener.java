import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse_Listener extends JFrame implements MouseListener{

	JLabel label;
	ImageIcon footballIcon;
	ImageIcon cricketIcon;
	ImageIcon tennisIcon;
	ImageIcon basketballIcon;
	
	public Mouse_Listener() {
		
		footballIcon = new ImageIcon("football.png");
		cricketIcon = new ImageIcon("cricket.png");
		tennisIcon = new ImageIcon("tennisball.png");
		basketballIcon = new ImageIcon("basketball.png");
		
		label = new JLabel();
		label.setIcon(footballIcon);
		
		/*
		label.setBounds(50, 50, 100, 100);
		label.setBackground(Color.RED);
		label.setOpaque(true);
		*/
		
		label.addMouseListener(this);
		
		this.add(label);
		
		this.setTitle("Mouse Listener in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(600, 400);
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// System.out.println("You clicked!");
		// label.setBackground(Color.GREEN);
		label.setIcon(cricketIcon);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// System.out.println("You pressed!");
		// label.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// System.out.println("You released!");
		// label.setBackground(Color.BLACK);
		label.setIcon(basketballIcon);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// System.out.println("You entered!");
		// label.setBackground(Color.BLUE);
		label.setIcon(tennisIcon);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// System.out.println("You exited!");
		// label.setBackground(Color.RED);
		label.setIcon(footballIcon);
	}

}
