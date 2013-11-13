import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ScrumTest {

	Task task;
	Story story;
	@Before
	public void setUp() throws Exception {
		
		task=new Task(2);
		story=new Story(6,5);
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
		//assertEquals(4,story.getPriorityNum());
	}

}
