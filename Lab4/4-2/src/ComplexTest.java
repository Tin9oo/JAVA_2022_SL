import java.math.*;
class ComplexNumber {
	private double realPart, imagPart;
	
	ComplexNumber(){
		this.realPart = 0.0;
		this.imagPart = 0.0;
	}
	ComplexNumber(double realPart, double imagPart) {
		this.realPart = realPart;
		this.imagPart = imagPart;
	}
	
	void setReal(double realPart) {
		this.realPart = realPart;
	}
	void setImag(double imagPart) {
		this.imagPart = imagPart;
	}
	double getReal() {
		return this.realPart;
	}
	double getImag() {
		return this.imagPart;
	}
	double magnitude() {
		return Math.sqrt(this.realPart*this.realPart + this.imagPart*this.imagPart);
	}

	ComplexNumber add(ComplexNumber n) {
		ComplexNumber complexNumber = new ComplexNumber(this.realPart+n.realPart, this.imagPart+n.imagPart);
		
		return complexNumber;
	}
	ComplexNumber subtract(ComplexNumber n) {
		ComplexNumber complexNumber = new ComplexNumber(this.realPart-n.realPart, this.imagPart-n.imagPart);
		
		return complexNumber;
	}
	 
	void printNumber() {
		System.out.println(this.realPart + " + i * " + this.imagPart + "\n" + this.magnitude());
	}
}

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber n1 = new ComplexNumber();
		ComplexNumber n2 = new ComplexNumber();
		
		n1.setReal(5);
		n1.setImag(7.5);
		n2.setReal(-3.1);
		n2.setImag(5.7);
		
		System.out.print("n1 is -> \t");
		n1.printNumber();
		System.out.print("n2 is -> \t");
		n2.printNumber();
		
		ComplexNumber n3 = n1.add(n2);
		System.out.print("n1 + n2 -> \t");
		n3.printNumber();
		
		System.out.print("n1 - n2 -> \t");
		n1.subtract(n2).printNumber();

	}

}
