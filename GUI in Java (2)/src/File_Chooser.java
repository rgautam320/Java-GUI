import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class File_Chooser extends JFrame implements ActionListener{

	JButton button;
	public File_Chooser() {
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		
		this.setTitle("File Choose in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 400);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == button)
		{
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("C:\\Users\\user\\Desktop"));
			
			int response = fileChooser.showOpenDialog(null);
			// int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION)
			{
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				
				System.out.println(file);
			}
			
		}
	}

}
