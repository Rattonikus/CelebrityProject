package celeb.model;

/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	private String answer; 
	/**
	 * The answer or name of the celebrity.
	 */
	private String clue; 
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		this.answer = answer; 
		this.clue = clue; 
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return answer;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		this.clue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		this.answer = answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		String description = "This is a celebrity";
		description += "\n" + "With an answer of " + getAnswer();
		description += " specified by clue + ";
		description += clue;
	
		
		return description; 
	}
	
}
