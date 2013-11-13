
public class Story {

	private int storyPoint;
	private int priorityNum;

	public Story(int prioNum, int storyPoint) {
		// TODO Auto-generated constructor stub
		this.storyPoint=storyPoint;
		this.priorityNum=prioNum;
	}

	public int getStoryPoint() {
		return storyPoint;
	}

	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}

	public int getPriorityNum() {
		return priorityNum;
	}

	public void setPriorityNum(int priorityNum) {
		this.priorityNum = priorityNum;
	}

}
