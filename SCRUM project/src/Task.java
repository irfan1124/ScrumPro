
public class Task {

	
	public Task(int hour, String log) {
		// TODO Auto-generated constructor stub
		this.hours_needed=hour;
		this.tName=log;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	int hours_needed;
	String tName;

	public int getHours_needed() {
		return hours_needed;
	}

	public void setHours_needed(int hours_needed) {
		this.hours_needed = hours_needed;
	}
	
}
