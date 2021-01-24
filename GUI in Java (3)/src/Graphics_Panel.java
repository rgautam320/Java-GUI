import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Graphics_Panel extends JPanel{
	
	public Graphics_Panel() {
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	Image iconImage1;
	Image iconImage2;
	
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;
		
		/* ------------------------------------------ */
		
		iconImage1 = new ImageIcon("basketball.png").getImage();
		iconImage2 = new ImageIcon("cricket.png").getImage();
		
		/* ------------------------------------------ */
		g2D.setPaint(Color.RED);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(0, 0, 500, 500);
		
		/* ------------------------------------------ */
		
		g2D.setPaint(Color.GREEN);
		// g2D.drawRect(0, 0, 200, 200);
		g2D.fillRect(0, 0, 200, 200);
		
		/* ------------------------------------------ */
		
		g2D.setPaint(Color.cyan);
		// g2D.drawOval(250, 10, 200, 200);
		g2D.fillOval(250, 10, 200, 200);
		
		/* ------------------------------------------ */
		
		g2D.setPaint(Color.pink);
		// g2D.drawArc(10, 250, 100, 100, 0, 180);
		g2D.fillArc(10, 250, 100, 100, 0, 180);
		
		g2D.setPaint(Color.green);
		g2D.fillArc(10, 250, 100, 100, 180, 180);
		
		/* ------------------------------------------ */
		
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.setPaint(Color.yellow);
		// g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.fillPolygon(xPoints, yPoints, 3);
		
		/* ------------------------------------------ */

		g2D.setPaint(Color.BLACK);
		g2D.setFont(new Font("Ink Free", Font.BOLD, 35));
		g2D.drawString("You are winner", 50, 400);
		
		/* ------------------------------------------ */
		
		g2D.drawImage(iconImage1, 300, 400, null);
		g2D.drawImage(iconImage2, 300, 100, null);
		
	}
}
