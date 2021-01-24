import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Graphics_2D extends JFrame{
	
	Graphics_Panel panel;
	
	public Graphics_2D() {
		
		panel = new Graphics_Panel();
		
		this.add(panel);
		
		this.setTitle("2D Graphics in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

}
