package day3.assignment1;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private static int studentCount = 10;
	
	Student()
	{
		studentId+=1;
	}
	
	Student(char sType, String fname, String lname)
	{
		this();
		studentId = 550 + studentCount;
		studentType = sType;
		studentName = fname+lname;
	}
	
	public int getStudentCount()
	{
		return this.studentCount;
	}
	
	public void displayDetails(Student obj)
	{
		System.out.println("Student ID - "+obj.studentId);
		System.out.println("Student Name - "+obj.studentName);
		System.out.println("Student Type - "+obj.studentType);
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		studentOne.displayDetails(studentOne);
		Student studentTwo = new Student('P', "Praharsh", "Trehan");
		studentTwo.displayDetails(studentTwo);
		Student studentThree = new Student('D', "Subham", "Nayak");
		studentThree.displayDetails(studentThree);
	}
}
