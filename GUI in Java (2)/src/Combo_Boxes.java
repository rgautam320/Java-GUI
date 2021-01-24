import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combo_Boxes extends JFrame implements ActionListener{

	JComboBox comboBox;
	
	Combo_Boxes()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Combo Box");
		
		String[] animalStrings = {"-Select-", "Dog", "Cat", "Bird"};
		comboBox = new JComboBox(animalStrings);
		comboBox.setEditable(false);
		
		comboBox.addItem("Horse");
		// comboBox.insertItemAt("Pig", 1);
		// comboBox.setSelectedIndex(0);
		// comboBox.removeItem("Horse");
		// comboBox.removeItemAt(1); 
		// comboBox.removeAllItems();
		
		comboBox.addActionListener(this);
		
		this.add(comboBox);
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox)
		{
			// System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
			comboBox.setEnabled(false);
		}
		
	}

}
