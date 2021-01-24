import javax.swing.JFrame;

public class Drag_Drop extends JFrame{

	Drag_Drop_Panel drag_Drop_Panel = new Drag_Drop_Panel();
	
	public Drag_Drop() {
		
		this.add(drag_Drop_Panel);
		
		this.setTitle("Drag and Drop in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 500);
		this.setVisible(true);
	}
}
