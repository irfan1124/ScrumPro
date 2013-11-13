
public class TeamMember {

	private String memberName;
	private String memberRole;
	
	
	
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
}
