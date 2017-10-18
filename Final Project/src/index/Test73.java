package index;

import javax.swing.JOptionPane;

public class Test73 {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double[] numbersToDisplay = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		for(int x = 0; x < numbersToDisplay.length; ++x)
			System.out.println(numbersToDisplay[x]);
		
		for(int y = numbersToDisplay.length - 1; y >= 0; -- y)
			System.out.println(numbersToDisplay[y]);
	
	}
	    
	}