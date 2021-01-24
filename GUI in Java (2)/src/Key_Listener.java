import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Key_Listener extends JFrame implements KeyListener{
	
	ImageIcon icon;
	JLabel label;
	public Key_Listener() {
		
		icon = new ImageIcon("football.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		// label.setBackground(Color.red);
		label.setIcon(icon);
		// label.setOpaque(true);
		
		this.add(label);
		this.addKeyListener(this);
		
		this.setTitle("Key Listener in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.CYAN);
		this.setSize(600, 400);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'a': {
			label.setLocation(label.getX()-10, label.getY());
			break;
		}
		case 'd': {
			label.setLocation(label.getX()+10, label.getY());
			break;
		}
		case 's': {
			label.setLocation(label.getX(), label.getY()+10);
			break;
		}
		case 'w': {
			label.setLocation(label.getX(), label.getY()-10);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + e.getKeyChar());
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37: {
			label.setLocation(label.getX()-10, label.getY());
			break;
		}
		case 39: {
			label.setLocation(label.getX()+10, label.getY());
			break;
		}
		case 40: {
			label.setLocation(label.getX(), label.getY()+10);
			break;
		}
		case 38: {
			label.setLocation(label.getX(), label.getY()-10);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + e.getKeyChar());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
	}

}
