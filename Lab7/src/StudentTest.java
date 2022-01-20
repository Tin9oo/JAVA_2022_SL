
abstract class Student {
	String name;
	int id;
	
	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	abstract int getAnnualSalary();
	
	String getName() {
		return name;
	}
	int getId() {
		return id;
	}
	public String toString() {
		return name + "("+id+")" + " : ";
	}
}

class Undergraduate extends Student {
	int semesterSalary;
	
	Undergraduate(String name, int id, int semesterSalary) {
		super(name, id);
		this.semesterSalary = semesterSalary;
	}
	
	int getAnnualSalary() {
		return 2*semesterSalary;
	}
	public String toString() {
		return super.toString() + "Undergraduate Student, semester salary : " + this.semesterSalary + ", annual salary : " + this.getAnnualSalary();
	}
}

class Graduate extends Student {
	int monthSalary;
	
	Graduate(String name, int id, int monthSalary) {
		super(name, id);
		this.monthSalary = monthSalary;
	}
	
	int getAnnualSalary() {
		return 12*monthSalary;
	}
	public String toString() {
		return super.toString() + "Graduate Student, month salary : " + this.monthSalary + ", annual salary : " + this.getAnnualSalary();
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[8];
		
		s[0] = new Graduate("Giggs", 20163103, 400000);
		s[1] = new Graduate("Carrick", 20163003, 500000);
		s[2] = new Graduate("Evra", 20155511, 350000);
		s[3] = new Graduate("Saha", 20143323, 550000);
		s[4] = new Undergraduate("Crouch", 20170103, 1000000);
		s[5] = new Undergraduate("Nevile", 20170012, 1200000);
		s[6] = new Undergraduate("Ji-sung", 20160429, 1100000);
		s[7] = new Undergraduate("Rooney", 20150718, 900000);
		
		for (int i=0; i<s.length; ++i) {
			System.out.println(s[i]);
		}
		
		int index=0;
		for (int i=1; i<s.length; ++i) {
			if(s[index].getAnnualSalary()<s[i].getAnnualSalary()) {
				index=i;
			}
		}
		System.out.println("\nA student who receives the highest salary : " + s[index].getName() + "("+s[index].getId()+")");
	}

}
