	import java.util.Scanner;
public class lab_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("Input for initiation : ");
		Scanner in = new Scanner(System.in);
		String input="";
		int temp=0;
		
		while(in.hasNext()) {
			// in = new Scanner(System.in);
			input = in.next();
			temp = (int)input.charAt(0);
			
			if(65<=temp&&temp<=90) {
				temp+=32;
				System.out.println((char)temp);
			}
			else if(97<=temp&&temp<=122) {
				temp-=32;
				System.out.println((char)temp);
			}
			else {
				System.out.println("No English.");
			}
		}
	}

}
