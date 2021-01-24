import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radio_Button extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;

	Radio_Button() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Radio Button");

		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hand Burger");
		hotdogButton = new JRadioButton("Hotdog");

		ButtonGroup group = new ButtonGroup();

		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);

		pizzaButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		hamburgerButton.addActionListener(this);

		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);

		this.setSize(400, 200);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("You ordered Pizza!");
		} else if (e.getSource() == hamburgerButton) {
			System.out.println("You ordered Hamburger!");
		} else if (e.getSource() == hotdogButton) {
			System.out.println("You ordered Hotdog!");
		}

	}

}
