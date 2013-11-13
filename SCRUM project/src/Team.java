import java.util.ArrayList;


public class Team {

	private ArrayList<TeamMember> member;
	/*public Team(TeamMember teamMem) {
		// TODO Auto-generated constructor stub
		this.member=teamMem;
	}*/
	
	public Team(ArrayList<TeamMember> teammem) {
		// TODO Auto-generated constructor stub
		this.member.addAll(teammem);
	}
	public ArrayList<TeamMember> getMember() {
		return member;
	}
	public void setMember(ArrayList<TeamMember> member) {
		this.member = member;
	}
	public void createteam(TeamMember teamMem1, TeamMember teamMem2,
			TeamMember teamMem3, TeamMember teamMem4) {
		// TODO Auto-generated method stub
		member.add(teamMem1);
		member.add(teamMem2);
		member.add(teamMem3);
		member.add(teamMem4);
	}


}
