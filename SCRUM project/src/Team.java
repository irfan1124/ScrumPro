import java.util.ArrayList;


public class Team {

	private ArrayList<TeamMember> member;
	/*public Team(TeamMember teamMem) {
		// TODO Auto-generated constructor stub
		this.member=teamMem;
	}*/
	
	public Team(ArrayList<TeamMember> teammem) {
		// TODO Auto-generated constructor stub
		this.member=teammem;
	}
	public ArrayList<TeamMember> getMember() {
		return member;
	}
	public void setMember(ArrayList<TeamMember> member) {
		this.member = member;
	}


}
