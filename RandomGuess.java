import javax.swing.JOptionPane;

public class RandomGuess
{
	public static void main(String[] args)
	{
		int guess;
		int result;
		String message;
		int attempts = 1;
		final int MAX = 10;
		final int MIN = 1;
		// Game mechanics
		result = MIN + (int)(Math.random() * MAX);

		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess the magic number between " + MIN + " and " + MAX));

		// Enter a while loop and execute decision making mechanics
		while(result != guess)
		{
				if(guess < result)
				{
					message = "Sorry your guess was too low!";
				}
				else
				{
					message = "Sorry, your guess was too high!";
				}
				// Guess was evaluated, show the user the result, ask them to play again
				guess = Integer.parseInt(JOptionPane.showInputDialog(null, message + "Try again! \nPlease guess another number between " + MIN + " and " + MAX));
				attempts++;
			}
		// Output occurs only after the while loop has ben exited
		JOptionPane.showMessageDialog(null, "Congrats! You have a match. It took you " + attempts + " tries to get a match");
	}
}