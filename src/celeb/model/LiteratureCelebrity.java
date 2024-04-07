package celeb.model;
import java.util.ArrayList;

import celeb.model.Celebrity;

public class LiteratureCelebrity extends Celebrity  
{
	
	private ArrayList<String> clueList;
	

	
	public LiteratureCelebrity(String name, String clue)
	{
		super(name, clue);
		processClues();
	}
	
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		this.clueList = new ArrayList<String>();
		
		for (String clue : clues)
		{
			clueList.add(clue);
		}
	}
	
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues(); 
		}
		String clue = clueList.remove(0);
		return clue; 
	}
	
	
	
	@Override
	public String toString()
	{
		String description = "This is a literature celebrity";
		description += "\n" + "With an answer of " + getAnswer();
		description += " specified by clues: ";
		for (String clue : super.getClue().split(","));
		{
			description += "\n" + super.getClue(); 


		}
		System.out.println(description);

		return description; 
	}

}
