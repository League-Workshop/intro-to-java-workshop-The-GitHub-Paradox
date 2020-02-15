package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String Q1 = JOptionPane.showInputDialog("Omega Shaggy or Shrek?");
		String Q2 = JOptionPane.showInputDialog("The Ting goes skrrrrrrta. Whomst'de say'ed dis MLG fhrase?");
		String Q3 = JOptionPane.showInputDialog("Ah yes ________ meme man");
		String Q4 = JOptionPane.showInputDialog("Dunked on");
		String Q5 = JOptionPane.showInputDialog("-1 point m8? (y/n)");
		
		// 3.  Use an if statement to check if their answer is correct
		if(Q1.equalsIgnoreCase("Yes")) {
			score++;
		}
		if(Q2.equalsIgnoreCase("Big Shaq")) {
			score++;
		}
		if(Q3.equalsIgnoreCase("enslaved")) {
			score++;
		}
		if(Q4.equalsIgnoreCase("Sanesss")) {
			score++;
		}
		if(Q5.equalsIgnoreCase("y")) {
			score--;
		}
		JOptionPane.showMessageDialog(null, "Wow u suck your score is " + score);
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
