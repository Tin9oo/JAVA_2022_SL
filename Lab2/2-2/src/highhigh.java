import java.util.Scanner;
public class highhigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int height=0;
		do {
			System.out.print("Enter the height : ");
			height = in.nextInt();
		} while(height<=0);
		
		int cnt=0;
		for(int i=0;i<height-1;++i, System.out.println()) {
			cnt++;
			int k;
			for(k=0;k<cnt;++k) {
				System.out.print("*");
			}
			for(k=0;k<(height*2-1)-cnt*2;++k) {
				System.out.print(" ");
			}
			for(k=0;k<cnt;++k) {
				System.out.print("*");
			}
		}
		for(int j=0;j<(height*2-1);++j) {
			System.out.print("*");
		}
		
	}

}
