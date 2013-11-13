import java.util.ArrayList;


public class Sprint {

	//private Story story;
	private ArrayList<Story> story = new ArrayList<Story>();
	
	Sprint(ArrayList<Story> story)
	{
		this.story=story;
	}

	public ArrayList<Story> getStory() {
		return story;
	}

	public void setStory(ArrayList<Story> story) {
		this.story = story;
	} 

	
}
