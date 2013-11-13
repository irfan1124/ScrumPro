import java.util.ArrayList;


public class Sprint {

	//private Story story;
	private int velocity;
	

	private ArrayList<Story> story = new ArrayList<Story>();
	
	
	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
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
