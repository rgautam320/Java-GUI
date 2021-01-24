import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animation_Panel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	
	Image enemy;
	Timer timer;

	int xVelocity = 5;
	int yVelocity = 5;
	int x = 0;
	int y = 0;
	
	public Animation_Panel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.CYAN);
		
		enemy = new ImageIcon("tennisball.png").getImage();
	
		timer = new Timer(10, this);
		timer.start();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);     			// This will paint background
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(enemy, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0)
		{
			xVelocity = -1 * xVelocity;
		}
		x = x + xVelocity;
		
		if(y >= PANEL_HEIGHT  - enemy.getHeight(null) || y < 0)
		{
			yVelocity = -1 * yVelocity;
		}
		y = y + yVelocity;
		
		repaint();
	}

}
