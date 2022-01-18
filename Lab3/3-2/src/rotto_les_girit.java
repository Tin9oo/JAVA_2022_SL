
public class rotto_les_girit {

	static void sort(int[] array) {
		// System.out.println("into the unkown");
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
			//System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] lottos = new int[5][6];
		
		int rn = (int)(Math.random()*(45-1+1))+1;
		byte[] flag = new byte[46];
		
		for(int i=0;i<flag.length;++i) {
			flag[i]=0;
		}
		
		for(int i=0;i<lottos.length;++i) {
			for(int j=0;j<lottos[0].length;++j) {
				rn = (int)(Math.random()*(45-1+1))+1;
				if(flag[rn]==0) {
					lottos[i][j]=rn;
					flag[rn]=1;
				}
				else if(flag[rn]==1) {
					--j;
				}
			}
			sort(lottos[i]);
		}
		for(int i=0;i<lottos.length;++i, System.out.println()) {
			for(int j=0;j<lottos[0].length;++j) {
				System.out.print(lottos[i][j] + " ");
			}
		}
		
	}

}
