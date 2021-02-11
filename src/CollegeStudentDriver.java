
public class CollegeStudentDriver {

	public static void main(String[] args) {
		
		System.out.println("This is the start of the project, so more will come soon.");
		
		CollegeStudent michael = new CollegeStudent("Michael", 19, "Quinnipiac");
		
		for(int i = 0; i < 4; i++) {
			michael.doAssignment();
		}
	}

}
