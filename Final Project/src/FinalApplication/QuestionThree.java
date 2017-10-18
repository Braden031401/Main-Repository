package FinalApplication;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QuestionThree extends JFrame{
	private final int SIZE = 180;
	private Container con = getContentPane();
	private JButton button = new JButton("A Rock");
	
	private final int SIZE1 = 180;
	private Container con1 = getContentPane();
	private JButton button1 = new JButton("A Large Bottle Lid");
	
	private final int SIZE2 = 180;
	private Container con2 = getContentPane();
	private JButton button2 = new JButton("A Pinecone");
	
	private final int SIZE3 = 180;
	private Container con3 = getContentPane();
	private JButton button3 = new JButton("Frozen Cow Manure");

	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	public QuestionThree()
	{
		label.setText("The first puck used in the game of ice hockey was?");
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		setSize(SIZE, SIZE);
		con.setLayout(new FlowLayout());
		con.add(button);
		con.setBackground(Color.BLACK);
		button.setBackground(Color.BLUE);
		button.setForeground(Color.WHITE);
		button.setMnemonic(KeyEvent.VK_A);
		button.setActionCommand("0");
		button.addActionListener(a -> JOptionPane.showMessageDialog(null, "Wrong Answer"));
		
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
		button3.addActionListener(d -> JOptionPane.showMessageDialog(null, "Correct!"));
		button3.addActionListener(d -> QuestionFour.main(null));
		button3.addActionListener(d -> dispose());
		button3.addActionListener(d -> frame.dispose());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionThree frame = new QuestionThree();
		frame.setVisible(true);
	}

}

