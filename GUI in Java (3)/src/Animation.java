import javax.swing.JFrame;

public class Animation extends JFrame{
	
	Animation_Panel panel;
	
	public Animation() {
		
		panel = new Animation_Panel();
		
		this.add(panel);
		
		this.setTitle("Animation in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setVisible(true);
	}

}
