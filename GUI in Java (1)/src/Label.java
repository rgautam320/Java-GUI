import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		
		ImageIcon imageIcon2 = new ImageIcon("basketball.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN);
		
		label.setText("What's up Mr.?");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setIcon(imageIcon2);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setIconTextGap(10);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		
		frame.setTitle("Label in GUI JAVA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.add(label);
		frame.pack();
		frame.setVisible(true);

	}

}
