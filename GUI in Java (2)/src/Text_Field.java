import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Text_Field extends JFrame implements ActionListener{
	
	JButton button = new JButton("Submit");
	JTextField textField = new JTextField();
	Text_Field()
	{
		
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 30));
		textField.setForeground(Color.cyan);
		textField.setBackground(Color.magenta);
		textField.setCaretColor(Color.WHITE);
		textField.setText("Username");
		textField.setEditable(true);
		this.add(textField);
		
		
		button.addActionListener(this);
		this.add(button);
		
		
		this.setTitle("Text Field in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setSize(500, 300);
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			System.out.println("Hello " + textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
		}
		
	}
}
