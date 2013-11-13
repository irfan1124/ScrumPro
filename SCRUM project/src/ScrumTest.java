import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class ScrumTest {

	Task task;
	Story story,story2;
	Sprint sprint1;
	ArrayList<Story> Sprintstory;
	ArrayList<TeamMember> teammem;
	Team team;
	TeamMember teamMem1,teamMem2,teamMem3,teamMem4;
	
	@Before
	public void setUp() throws Exception {
		
		task=new Task(2);
		story=new Story(6,5,"loginStudent");
		story2=new Story(6,5,"loginStudent");
		teamMem1= new TeamMember("munib","ScrumMaster");
		teamMem2= new TeamMember("mac","PO");
		teamMem3= new TeamMember("sheku","customer");
		teamMem4= new TeamMember("sada","member4");
		teammem.add(teamMem1);
		teammem.add(teamMem2);
		teammem.add(teamMem3);
		teammem.add(teamMem4);
		
		//team= new Team(teammem);
		//team= new Team(teamMem2);
		//team= new Team(teamMem3);
		//team= new Team(teamMem4);
		
		//Sprintstory.add(story2);
		//sprint1 = new Sprint(Sprintstory);
		
		//sprint1.getStory().add(story2);
		//Sprintstory.add(story);
		//System.out.print(Sprintstory.get(0));
		//sprint1 = new Sprint(Sprintstory);
	}

	@Test
	public void testTask() {
		
		assertEquals(2, task.getHours_needed());
		//assertEquals(3, task.getHours_needed());
		//assertEquals("4", task.getHours_needed());
	}
	
	@Test
	public void testStory() {
		
		assertEquals(6, story.getPriorityNum());
		assertEquals(5, story.getStoryPoint());
		assertEquals("loginStudent", story.getTitle());
		//assertEquals(4,story.getPriorityNum());
	}
	
	@Test
	public void testSprint() {
		
		assertEquals(6, sprint1.getStory().set(0, story));
		//assertEquals(5, story.getStoryPoint());
		//assertEquals(4,story.getPriorityNum());
	}
	
	@Test
	public void testTeamMember() {
		
		assertEquals("munib", teamMem1.getMemberName());
		assertEquals("ScrumMaster", teamMem1.getMemberRole());
		//assertEquals(5, story.getStoryPoint());
		//assertEquals(4,story.getPriorityNum());
	}
	
	@Test
	public void testTeam() {
		
		//assertEquals("munib", team.getMember().getMemberName());
		//assertEquals("ScrumMaster", team.getMember().getMemberRole());
		assertEquals("munib", team.getMember().get(0).getMemberName());
		//assertEquals(5, story.getStoryPoint());
		//assertEquals(4,story.getPriorityNum());
	}

}
