import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Color_Chooser extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	public Color_Chooser() {
		
		button = new JButton("Pick Color");
		button.addActionListener(this);
		button.setFocusable(false);
		
		
		label = new JLabel();
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		label.setText("This is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 60));
		
		this.add(button);
		this.add(label);
		
		this.setTitle("Color Chooser in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(600, 400);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = colorChooser.showDialog(null, "Pick a Color", Color.BLACK);
			
			label.setForeground(color);
			// label.setBackground(color);
		}
		
	}

}
