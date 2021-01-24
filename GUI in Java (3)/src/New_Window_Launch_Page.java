import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class New_Window_Launch_Page implements ActionListener{
	JFrame frame = new JFrame("Launch Page");
	JButton button = new JButton("New Window");
	
	New_Window_Launch_Page() {
		
		button.setBounds(150, 160, 200, 40);
		button.setFocusable(true);
		button.addActionListener(this);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		frame.add(button);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			frame.dispose();
			New_Window myWindow = new New_Window();
		}
		
	}

}
