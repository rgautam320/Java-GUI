import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu_Bar extends JFrame implements ActionListener{

	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	JMenuItem copyItem;
	JMenuItem cutItem;
	JMenuItem pasteItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	ImageIcon copyIcon;
	ImageIcon cutIcon;
	ImageIcon pasteIcon;
	
	Menu_Bar() {
		this.setTitle("Menubars in GUI JAVA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 400);
		
		// ---------------------------------------------------- 
		
		JMenuBar menuBar = new JMenuBar();
		
		// ----------------------------------------------------
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		copyIcon = new ImageIcon("copy.png");
		cutIcon = new ImageIcon("cut.png");
		pasteIcon = new ImageIcon("paste.png");
		
		// ----------------------------------------------------
		
		JMenu fileMenu = new JMenu("File");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_Z);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
			
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		menuBar.add(fileMenu);
		
		// ----------------------------------------------------
		
		JMenu editMenu = new JMenu("Edit");
		
		editMenu.setMnemonic(KeyEvent.VK_E);
		
		copyItem = new JMenuItem("Copy");
		cutItem = new JMenuItem("Cut");
		pasteItem = new JMenuItem("Paste");
		
		copyItem.setMnemonic(KeyEvent.VK_C);
		cutItem.setMnemonic(KeyEvent.VK_X);
		pasteItem.setMnemonic(KeyEvent.VK_V);
		
		copyItem.setIcon(copyIcon);
		cutItem.setIcon(cutIcon);
		pasteItem.setIcon(pasteIcon);
		
		editMenu.add(copyItem);
		editMenu.add(cutItem);
		editMenu.add(pasteItem);
		
		copyItem.addActionListener(this);
		cutItem.addActionListener(this);
		pasteItem.addActionListener(this);
		
		menuBar.add(editMenu);
		
		// ----------------------------------------------------
		
		JMenu helpMenu = new JMenu("Help");
		
		helpMenu.setMnemonic(KeyEvent.VK_H);

		menuBar.add(helpMenu);
	
		// ----------------------------------------------------
		
		this.setJMenuBar(menuBar);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem)
		{
			System.out.println("File Loaded");
		}
		if(e.getSource() == saveItem)
		{
			System.out.println("File Saved");
		}
		if(e.getSource() == exitItem)
		{
			System.exit(0);
		}
		
		if(e.getSource() == copyItem)
		{
			System.out.println("Copied to Clipboard");
		}
		if(e.getSource() == cutItem)
		{
			System.out.println("Copied to Clipboard");
		}
		if(e.getSource() == pasteItem)
		{
			System.out.println("Pasted Successfully");
		}
		
	}
}
