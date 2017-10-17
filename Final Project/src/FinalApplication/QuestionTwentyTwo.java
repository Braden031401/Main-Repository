package FinalApplication;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QuestionTwentyTwo extends JFrame{
	private final int SIZE = 180;
	private Container con = getContentPane();
	private JButton button = new JButton("Apples");
	
	private final int SIZE1 = 180;
	private Container con1 = getContentPane();
	private JButton button1 = new JButton("Showers");
	
	private final int SIZE2 = 180;
	private Container con2 = getContentPane();
	private JButton button2 = new JButton("Smoothies");
	
	private final int SIZE3 = 180;
	private Container con3 = getContentPane();
	private JButton button3 = new JButton("Bananas");

	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	public QuestionTwentyTwo()
	{
		label.setText(" ________ are more efficient than caffeine to wake you up in the morning.");
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//This button is different from every other button because it restarts the game by opening the game menu.
		setSize(SIZE, SIZE);
		con.setLayout(new FlowLayout());
		con.add(button);
		con.setBackground(Color.BLACK);
		button.setBackground(Color.BLUE);
		button.setForeground(Color.WHITE);
		button.setMnemonic(KeyEvent.VK_A);
		button.setActionCommand("0");
		button.addActionListener(a -> JOptionPane.showMessageDialog(null, "WIN!"));
		button.addActionListener(a -> Menu.main(null));
		button.addActionListener(a -> dispose());
		button.addActionListener(a -> frame.dispose());
		
		setSize(SIZE1, SIZE1);
		con1.setLayout(new FlowLayout());
		con1.add(button1);
		con1.setBackground(Color.BLACK);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		button1.setMnemonic(KeyEvent.VK_B);
		button1.setActionCommand("1");
		button1.addActionListener(b -> JOptionPane.showMessageDialog(null, "Wrong Answer"));

		setSize(SIZE2, SIZE2);
		con2.setLayout(new FlowLayout());
		con2.add(button2);
		con2.setBackground(Color.BLACK);
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);
		button2.setMnemonic(KeyEvent.VK_C);
		button2.setActionCommand("2");
		button2.addActionListener(c -> JOptionPane.showMessageDialog(null, "Wrong Answer"));

		setSize(SIZE3, SIZE3);
		con3.setLayout(new FlowLayout());
		con3.add(button3);
		con3.setBackground(Color.BLACK);
		button3.setBackground(Color.BLUE);
		button3.setForeground(Color.WHITE);
		button3.setMnemonic(KeyEvent.VK_D);
		button3.setActionCommand("3");
		button3.addActionListener(d -> JOptionPane.showMessageDialog(null, "Wrong Answer"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTwentyTwo frame = new QuestionTwentyTwo();
		frame.setVisible(true);
	}
}