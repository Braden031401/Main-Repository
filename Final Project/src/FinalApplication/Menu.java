package FinalApplication;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
	
	//This is the section that creates buttons for the menu to use.
		private final int SIZE1 = 400;
		private Container con1 = getContentPane();
		private JButton button1 = new JButton("22 Questions");
	//The size does not change the size of the button, but the size of the window when it is first opened.
		private final int SIZE = 400;
		private Container con = getContentPane();
		private JButton button = new JButton("Play");
	//The word "Quit" is the word that will be displayed on the button. You can change it to say other things.
		private final int SIZE2 = 400;
		private Container con2 = getContentPane();
		private JButton button2 = new JButton("Quit");
		
		public Menu()
		{
			//This is the section of code that changes what the buttons look like, you can change their color by typing in different values.
			setSize(SIZE1, SIZE1);
			con1.setLayout(new FlowLayout());
			con1.add(button1);
			con1.setBackground(Color.BLACK);
			button1.setBackground(Color.BLUE);
			button1.setForeground(Color.GREEN);
			button1.setEnabled(false);
			
			setSize(SIZE, SIZE);
			con.setLayout(new FlowLayout());
			con.add(button);
			con.setBackground(Color.BLACK);
			button.setBackground(Color.BLUE);
			button.setForeground(Color.WHITE);
			button.setMnemonic(KeyEvent.VK_M);
			button.setActionCommand("go");
			button.addActionListener(m -> Game.gameStart());
			button.addActionListener(m -> dispose());
			
			setSize(SIZE2, SIZE2);
			con2.setLayout(new FlowLayout());
			con2.add(button2);
			con2.setBackground(Color.BLACK);
			button2.setBackground(Color.BLUE);
			button2.setForeground(Color.WHITE);
			button2.setMnemonic(KeyEvent.VK_E);
			button2.setActionCommand("stop");
			button2.addActionListener(e -> System.exit(0));
			
		}
		public static void main(String[] args)
		{
			Menu frame = new Menu();
			frame.setVisible(true);
		
		}
			
		
}

			
		
	


