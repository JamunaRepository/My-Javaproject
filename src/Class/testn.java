package Class;

import org.testng.annotations.Test;

public class testn {

	@Test(priority=1)
	public void writetestcase() {
		System.out.println("First test case is supposed to be written");
		}
	@Test(priority=2)
	public void executetestcase() {
		System.out.println("First test case is supposed to be executed");
		
		@Test(priorty=3)
		public void defectlog() {
		System.out.println("defect log must be logged");
			
		}
		
	}
	
	
	
	
}
