// Donna Murphy 21147458
// TEMPLATE
/*
ROCK PAPER SCISSORS
*/

//imports
import javax.swing.JOptionPane;


//standard opening classes
	public class rockPaperScissorsApp{
	public static void main(String[] args){


	// Set Vars
	int playerChoice;
	int compChoice = (int)(Math.random() * 3)+1;
	String ans;
	String[] choices = {"Rock","Paper","Scissors"};// String Array 0,1,2

	// objects
	rockPaperScissors newGame;
	newGame = new rockPaperScissors();


	// Inputs - ask user to pick Rock Paper or Scissors. Apply the choices array to choice buttons and add 1 so it returns 1,2 or 3
	playerChoice = JOptionPane.showOptionDialog(null, "Whats your choice?","Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0])+1;
    //Displays what the user chose and What the Computer chose
    JOptionPane.showMessageDialog(null, "You Chose " + choices[playerChoice-1] + " The Machine Chose " + choices[compChoice - 1]);

	// Set - sends tha values of what the user picked (1,2 or 3) to the instantiable class and sets the playerChoice
	//variable in the instantiable class to that value
	newGame.setPlayerChoice(playerChoice);
	newGame.setCompChoice(compChoice);


	// Compute = calls the compute method in the instanstiable class, it runs with the values sent from newGame instance
	newGame.compute();


	// Get - this assigns the returned value from the getAns Method in the instansiable to teh ans variable in teh app class
	ans = newGame.getAns();

    // Output - displays result
    JOptionPane.showMessageDialog(null, ans);
	}

}