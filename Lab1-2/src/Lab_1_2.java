import java.util.Scanner;
import java.math.*;

public class Lab_1_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a[] = new int[3];
		int sum=0;
		int max=0;
		int others=0;
		
		double s;
		double temp;
		double S;
		
		for(int i=0;i<3;++i) {
			a[i]=in.nextInt();
		}
		for(int j=0;j<3;++j) {
			if(a[j]>max) max = a[j];
			sum+=a[j];
		}
		System.out.println("Sum is " + sum);
		others = sum-max;
		
		if(others<=max) System.exit(0);
		
		s = (double)sum/2.0;
		temp = s*(s-a[0])*(s-a[1])*(s-a[2]);
		S = Math.sqrt(temp);
		
		System.out.println(S);
		in.close();
	}
}
