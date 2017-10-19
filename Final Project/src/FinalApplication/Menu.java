package FinalApplication;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
	

		private final int SIZE2 = 180;
		private Container con2 = getContentPane();
		private JButton button2 = new JButton("Play");

		//Creates the quit button
		private final int SIZE3 = 180;
		private Container con3 = getContentPane();
		private JButton button3 = new JButton("Quit");
		
		private final int SIZE3 = 180;
		private Container con3 = getContentPane();
		private JButton button3 = new JButton("HighScores");
		
		public Menu()
		{

			setSize(SIZE1, SIZE1);
			con1.setLayout(new FlowLayout());
			con1.add(button1);
			con1.setBackground(Color.BLACK);
			button1.setBackground(Color.BLUE);
			button1.setForeground(Color.GREEN);
			button1.setEnabled(false);
			

			setSize(SIZE2, SIZE2);
			con2.setLayout(new FlowLayout());
			con2.add(button2);
			con2.setBackground(Color.BLACK);
			button2.setBackground(Color.BLUE);
			button2.setForeground(Color.WHITE);

			setSize(SIZE3, SIZE3);
			con3.setLayout(new FlowLayout());
			con3.add(button3);
			con3.setBackground(Color.BLACK);
			button3.setBackground(Color.BLUE);
			button3.setForeground(Color.WHITE);
      button3.addActionListener(System.exit(0));

      //High Score button.
			setSize(SIZE3, SIZE3);
			con3.setLayout(new FlowLayout());
			con3.add(button3);
			con3.setBackground(Color.BLACK);
			button3.setBackground(Color.BLUE);
			button3.setForeground(Color.WHITE);
			button3.addActionListener(d -> HighScoreTrick.main(null));
		}
		public static void main(String[] args)
		{
			//This line tells the program that the JFrame should be visible, without this the program would not work.
			Menu frame = new Menu();
			frame.setVisible(true);
		
		}


}

			
		
	


