import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drag_Drop_Panel extends JPanel{
	
	ImageIcon icon = new ImageIcon("football.png");
	
	final int WIDTH = icon.getIconWidth();
	final int HEIGHT = icon.getIconHeight();
	
	Point imageCorner;
	Point previousPoint;
	
	public Drag_Drop_Panel() {
		
		imageCorner = new Point(0, 0);
		
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		icon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			previousPoint = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent e)
		{
			Point currentPoint = e.getPoint();
			
			imageCorner.translate((int)(currentPoint.getX() - previousPoint.getX()), (int)(currentPoint.getY() - previousPoint.getY()));
			
			previousPoint = currentPoint;
			repaint();
		}
	}
}
