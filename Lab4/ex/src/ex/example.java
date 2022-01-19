package ex;

class Person {
	String name;
	int age;
	
	Person(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(20);
		
		// p.name = "Kim DD";
		p.age = 20;
		
		System.out.println(p.getName());
	}

}
