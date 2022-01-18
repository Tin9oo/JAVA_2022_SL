
public class odd_matrix {

	static void printMultiTable(int high){
		int[][] array = new int[high][];
		
		for(int i=0;i<high;++i) {
			array[i] = new int[i+1];
		}
		
		int temp=0;
		for(int j=0;j<high;++j, System.out.println()) {
			temp=j;
			for(int k=0;k<(temp+1);++k, System.out.print("\t")) {
				array[j][k] = (j+1)*(k+1);
				System.out.print(array[j][k]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiTable(7);
	}

}
