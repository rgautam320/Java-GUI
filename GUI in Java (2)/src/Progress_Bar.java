import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progress_Bar extends JFrame{

	JFrame frame = new JFrame();
	JProgressBar bar1 = new JProgressBar();
	JProgressBar bar2 = new JProgressBar();
	
	public Progress_Bar() {
		
		frame.setTitle("Progress Bar in GUI JAVA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);
		frame.setVisible(true);
		
		bar1.setValue(0);
		bar1.setBounds(4, 4, 400, 50);
		bar1.setStringPainted(true);
		bar1.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar1.setForeground(Color.GREEN);
		bar1.setBackground(Color.DARK_GRAY);
		
		frame.add(bar1);
		fill1();
		
		bar2.setValue(0);
		bar2.setBounds(4, 64, 400, 50);
		bar2.setStringPainted(true);
		bar2.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar2.setForeground(Color.GREEN);
		bar2.setBackground(Color.DARK_GRAY);
		
		frame.add(bar2);
		
		
		fill2();
		
	}
	
	public void fill1()
	{
		int counter = 0;
		while(counter <= 100)
		{
			bar1.setValue(counter);
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			counter += 1;
		}
		bar1.setString("Done!");
	}
	
	public void fill2()
	{
		int counter = 100;
		while(counter >= 0)
		{
			bar2.setValue(counter);
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			counter -= 1;
		}
		bar2.setString("Done! Done!");
	}
}
