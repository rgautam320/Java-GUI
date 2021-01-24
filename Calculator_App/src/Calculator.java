import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Calculator implements ActionListener{
	
	JFrame frame;
	JTextField textField;
	JPanel panel;
	ImageIcon icon = new ImageIcon("calculator.png");
	
	/* -------------------------------------------------------------------------------------------------------- */
	
	JButton numberButtons[] = new JButton[10];
	JButton functionButtons[] = new JButton[9];
	JButton addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton, negButton;

	/* -------------------------------------------------------------------------------------------------------- */
	
	Font font = new Font("Ink Free", Font.BOLD, 30);
	
	/* -------------------------------------------------------------------------------------------------------- */
	
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	char operator;
	
	/* -------------------------------------------------------------------------------------------------------- */
	
	public Calculator() 
	{
		frame = new JFrame("My Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(335, 480);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(icon.getImage());
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		textField = new JTextField();
		textField.setBounds(10, 10, 300, 60);
		textField.setFont(font);
		textField.setEditable(false);
		textField.setBackground(Color.WHITE);
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("÷");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("C");
		negButton = new JButton("'-'");
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		for (int i = 0; i < 9; i++)
		{
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(font);
			functionButtons[i].setFocusable(false);
			functionButtons[i].setBorder(null);
		}
		
		equButton.setBackground(Color.ORANGE);
		clrButton.setBackground(Color.ORANGE);
		
		for(int i = 0; i < 10; i++)
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setFont(font);
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFocusable(false);
			numberButtons[i].setBorder(null);
		}
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		negButton.setBounds(10, 380, 90, 50);
		delButton.setBounds(115, 380, 90, 50);
		clrButton.setBounds(220, 380, 90, 50);
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		panel = new JPanel();
		panel.setBounds(10, 90, 300, 280);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(divButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(mulButton);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(subButton);
		
		panel.add(numberButtons[0]);
		panel.add(decButton);
		panel.add(addButton);
		panel.add(equButton);
		
		/* -------------------------------------------------------------------------------------------------------- */

		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(negButton);
		frame.add(textField);
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		frame.setVisible(true);
	}
	
	/* -------------------------------------------------------------------------------------------------------- */
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
	
	/* -------------------------------------------------------------------------------------------------------- */

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 10; i++)
		{
			if(e.getSource() == numberButtons[i])
			{
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		if(e.getSource() == decButton)
		{
			textField.setText(textField.getText().concat("."));
		}
		
		if(e.getSource() == addButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		
		if(e.getSource() == subButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		
		if(e.getSource() == mulButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		
		if(e.getSource() == divButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		
		if(e.getSource() == negButton)
		{
			double temp = Double.parseDouble(textField.getText());
			temp *= -1;
			textField.setText(String.valueOf(temp));
		}
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		if(e.getSource() == delButton)
		{
			String string = textField.getText();
			textField.setText("");
			for(int i = 0; i < string.length() - 1; i++)
			{
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
		
		if(e.getSource() == clrButton)
		{
			textField.setText("");
		}
		
		/* -------------------------------------------------------------------------------------------------------- */
		
		if(e.getSource() == equButton)
		{
			num2 = Double.parseDouble(textField.getText());
			
			switch (operator) {
			case '+': 
			{
				result = num1 + num2;
				break;
			}
			case '-': 
			{
				result = num1 - num2;
				break;
			}
			case '*': 
			{
				result = num1 * num2;
				break;
			}
			case '/': 
			{
				result = num1 / num2;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + operator);
			}
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		
		/* -------------------------------------------------------------------------------------------------------- */

	}

}
