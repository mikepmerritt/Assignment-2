
public class CollegeStudent {
	
	private String name;
	private int age;
	private String college;
	private int numAssignments;
	
	public CollegeStudent(String studentName, int studentAge, String collegeName) {
		name = studentName;
		age = studentAge;
		college = collegeName;
		numAssignments = (int) (Math.random()*3+1);
	}
	
	public void doAssignment() {
		if(numAssignments > 0) {
			int timeSpent = (int) (Math.random()*30+15);
			System.out.println(name + " finished the assignment in " + timeSpent + " minutes.");
			numAssignments--;
		}
		else {
			System.out.println(name + " has no more assignments to do!");
		}
	}
}
