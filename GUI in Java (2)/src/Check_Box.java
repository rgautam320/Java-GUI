import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Check_Box extends JFrame implements ActionListener{
	
	JButton button = new JButton();
	JCheckBox checkBox;
	
	Check_Box() {
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a Robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("consolas", Font.PLAIN, 30));
		
		button.setText("Submit");
		button.addActionListener(this);
		
		this.add(checkBox);
		this.add(button);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(250, 250);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			System.out.println(checkBox.isSelected());
			button.setEnabled(false);
			checkBox.setEnabled(false);
		}
		
	}
}
