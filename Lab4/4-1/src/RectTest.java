
class Rectangle{
	int x1, y1;
	int x2, y2;
	
	Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	Rectangle() {
		this(0, 0, 0, 0);
	}
	
	void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	boolean check() {
		if((x1==x2)||(y1==y2)) return false;
		return true;
	}
	int getArea() {
		int width, length;
		
		if (!check()) return 0;
		
		width = x1-x2;
		if (width<0) width = -width;
		length = y1-y2;
		if (length<0) length = -length;
		
		return width*length;
	}
	void show() {
		if (!check()) {
			System.out.println("No");
			//return;
		}
		System.out.println("(x1, y1), (x2,y2)" + x1 + y1 + x2 + y2);
		System.out.println(getArea());
	}
	boolean equals(Rectangle r) {
		int width1, width2;
		int length1, length2;
		
		width1 = this.x1-this.x2;
		width2 = r.x1-r.x2;
		
		length1 = this.y1-this.y2;
		length2 = r.y1-r.y2;
		
		if(width1<0) width1=-width1;
		if(width2<0) width2=-width2;
		if(length1<0) length1=-length1;
		if(length2<0) length2=-length2;
		
		if((width1==width2)&&(length1==length2)&&(this.getArea()==r.getArea())) return true;
		else return false;
	}
}

public class RectTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		
		r.show();
		s.show();
		System.out.println(s.getArea());
		r.set(2, 1, 4, 5);
		r.show();
		System.out.println(r.getArea());
		if(r.equals(s)) System.out.println("두 사각형의 넓이는 같습니다.");
	}

}
