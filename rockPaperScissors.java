//instantiable Class

public class rockPaperScissors{


	// Set Vars
	private int playerChoice;
	private int compChoice;
	private String ans;

	// object
	public rockPaperScissors(){
		playerChoice = 0;
		compChoice = 0;
		ans = "";
	}

	// Set
	public void setPlayerChoice(int playerChoice){
		this.playerChoice = playerChoice;
	}
	public void setCompChoice(int compChoice){
			this.compChoice = compChoice;
	}

	// Compute
	public void compute()
	{
		// 1a - Check if player chose Rock(1)
		if (playerChoice == 1)
		{
			//1b - if player did choose Rock, its checks if computer chose Paper
			if(compChoice == 2)
			{
				//1b = if computer chose paper assign ans
				ans = "Paper Beats Rock , You lose";
			}
			//1c - if player did choose Rock, ans computer did not chose Paper, its checks if computer chose Scissors
			else if(compChoice == 3)
			{
				//1c = if computer chose scissors assign ans
				ans = "Rock Beats Scissors , You Win";
			}
			else
			{	//1d = if player chose Rock and Compter did not chose Paper or Scissors then it chose Rock"
				ans = "DRAW, you both chose Rock";
			}
		}
		// 2a - Check if player chose Paper(2)
		else if (playerChoice == 2)
		{
			//check computers choice and assign correct outcome
			if(compChoice == 1)
			{
				ans = "Paper Beats Rock , You Win";
			}
			else if(compChoice == 3)
			{
				ans = "Scissors Beats Paper , You lose";
			}
			else
			{
				ans = "DRAW, you both chose Paper";
			}
		}
		//3a - Check if player chose scissors
		else if (playerChoice == 3)
		{
			//check computers choice and assign correct outcome
			if(compChoice == 1)
			{
				ans = "Rock Beats Scissors , You Lose";
			}
			else if(compChoice == 2)
			{
				ans = "Scissors Beats Paper , You Win";
			}
			else
			{
				ans = "DRAW, you both chose Scissors";
			}
		}
		else
		{
		//4 - if player choice does not equal Rock paper of scissors the return error
		ans = "Error: You must chose Rock PAPER or SCISSORS to play";
		}
	}


	// Get
	public String getAns()
		{
		return ans;
		}



}






