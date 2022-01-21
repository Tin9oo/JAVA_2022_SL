
class Student {
	private static int staticID = 2017000;
	private int studentID;
	private String studentName;
	private double midScore, finalScore;
	
	public Student() {
		this.studentID=0;
		studentName="";
		midScore=finalScore=0;
		
	}
	public Student(String studentName, double midScore, double finalScore) {
		this();
		this.studentName=studentName;
		this.midScore=midScore;
		this.finalScore=finalScore;
	}
	
	public double getAvgScore() {
		return (this.midScore+this.finalScore)/2;
	}
	public String toString()
	static Student findBestStudent()
	static Student findWorstStudent()
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st = new Student[10];
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		st[0] = new Student("Jane", 57.8, 79.5);
		
		System.out.println("----- Student LIST ((StudentID) Name. MidScore, FinalScore, AvgScore) -----)");
		for(int i=0; i<st.length; ++i) System.out.println(st[i]);
		
		System.out.println();
		
		System.out.println("The best student : " + Student.findBestStudent());
		
		System.out.println("The worst student : " + Student.findWorstStudent());
	}

}
