
class Point {
	int x, y;
	
	Point() {
		x=y=0;
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void setPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class ColorPoint extends Point {
	String color;
	void setColot(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color + "\n" + "("+x+", "+y+")";
	}
}

public class toos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint p = new ColorPoint();
		
		p.setPoint(3, 4);
		p.setColot("red");
		System.out.print(p);
		
		System.out.print(p.getClass().getSimpleName());
	}

}
