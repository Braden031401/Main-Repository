package BradensHighScoreTesting;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import FinalApplication.BaseQuestion;

public class Score {
		
	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO Auto-generated method stub
				 int attemptsNum = 0;
				    final int maxAttempts = 1;
				    int score = 500;
					do {
					score -= 10;
					
					JOptionPane.showMessageDialog(null, "-10");
				    JOptionPane.showMessageDialog(null, "Your Score is "+ score);
				    } while (++attemptsNum <maxAttempts);

				    if (attemptsNum == maxAttempts);
				    
				    PrintWriter out = new PrintWriter("Score.txt");
				    out.println(score);
					
				    BaseQuestion.main(null);
	}
}

		
	


