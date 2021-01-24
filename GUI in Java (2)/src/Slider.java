import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	Slider() {
		frame = new JFrame("Slider Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setTitle("Slider Demo");
		
		
		slider = new JSlider(0, 100, 30);
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		// slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		slider.addChangeListener(this);
		
		label = new JLabel();
		label.setText("°C = " + slider.getValue());
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		
		panel = new JPanel();
		panel.add(slider);
		panel.add(label);
		
		frame.add(panel);
		
		frame.setSize(420, 420);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + slider.getValue());
		
	}

}
