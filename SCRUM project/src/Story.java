
public class Story {

	private String title;
	private int storyPoint;
	private int priorityNum;

	public Story(int prioNum, int storyPoint,String title) {
		// TODO Auto-generated constructor stub
		this.storyPoint=storyPoint;
		this.priorityNum=prioNum;
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
