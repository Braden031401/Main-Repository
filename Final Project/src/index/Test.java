package index;

import javax.swing.JOptionPane;

class Test {
	public static void main(String[] question, String[] answer, int n)
	{
		 String[] name = new String[n];  // Player Names
		    int[] playerscore = new int[n]; // Argument for Score
		    String[] que = new String[question.length]; //Questions for Loops
		    int score = 0; // Declare the score
		    
		    /* --------------------------- For loop for number of players --------------------------- */
		    for (int i = 0; i < n; i++) {
		        name[i] = JOptionPane.showInputDialog("What is your name player" + (i + 1) + "?");
		        JOptionPane.showMessageDialog(null, "Hello :" + name[i] + " Player number " + (i + 1) + ". I hope your ready to start!");
		        
		        /* --------------------------- Loop in Loop for questions --------------------------- */
		        for (int x = 0; x < question.length; x++) {
		            que[x] = JOptionPane.showInputDialog(question[x]);

		            if (que[x].equals(answer[x])) {
		                playerscore[i] = playerscore[i] + 1;
		            } else {
		                JOptionPane.showMessageDialog(null, "Wrong!");
		            }

		        } // End for loop for Question
		        playerscore[i] = score;
		        System.out.println("\nPlayer" + (i) + "Name:" + name[i] + "\tScore" + score);
	}


}
}