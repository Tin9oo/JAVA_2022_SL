import java.util.Scanner;
public class sortingprog {
	
	
	static void sort(int[] array) {
		System.out.println("into the unkown");
		int min=0;
		int cur=0;
		int temp=0;
		
		for(int i=0;i<array.length;++i) {
			cur=array[i];
			for(int j=i+1;j<array.length;++j) {
				min=array[j];
				if(cur>min) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					cur = array[i];
					min = array[j];
				}
			}
		}
		for(int i=0;i<array.length;++i) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String temp = in.nextLine();
		String[] spl = temp.split(" ");
		
		
		int[] array = new int[10];
		// array = in.nextInt();
		
		
		for(int i=0;i<array.length;++i) {
			array[i] = Integer.parseInt(spl[i]);
		}
		System.out.println("into the unkown");
		
		sort(array);
		
		
		
		
	}

}
