
public class TeamMember {

	private String memberName;
	private String memberRole;
	private Task task;
	
	
	public TeamMember(String name, String role) {
		// TODO Auto-generated constructor stub
		this.memberName=name;
		this.memberRole=role;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberRole() {
		return memberRole;
	}
	public void setMemberRole(String memberRole) {
		this.memberRole = memberRole;
	}
	
	public void allocatetask(Task task)
	{
		this.task=task;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
}
