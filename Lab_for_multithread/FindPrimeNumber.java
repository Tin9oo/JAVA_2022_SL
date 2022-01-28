import java.util.Arrays;

public class FindPrimeNumber {
	FindPrimeNumber(String name, SyncObject sObj) {
		WorkerThread thread = new WorkerThread(name, sObj);
		Thread th = new Thread(thread);
		th.start();
	}

	public static void main(String[] args) {
		SyncObject obj = new SyncObject();
		new FindPrimeNumber("0", obj);
		new FindPrimeNumber("1", obj);
		new FindPrimeNumber("2", obj);
		new FindPrimeNumber("3", obj);
		new FindPrimeNumber("4", obj);
		new FindPrimeNumber("5", obj);
		new FindPrimeNumber("6", obj);
		new FindPrimeNumber("7", obj);
		new FindPrimeNumber("8", obj);
		new FindPrimeNumber("9", obj);

		// obj.sortPrintPrimeArray();
	}
}

class SyncObject {
	final public int capacity=10;
	int[] primeArray = new int[capacity];
	int target=2;
	int i=0;
	int isWrite=-1;

	void prime() {
		for(;i<capacity;++target, isWrite=-1){ // i is synchronized?
			if(target==2) isWrite=2;
			else if(target==3) isWrite=3;
			else if(target==5) isWrite=5;
			else if(target==7) isWrite=7;
			else if(target%2==0) isWrite=-1;
			else{
				for(int j=3;(j*j)<=target;j+=2){
					if(target%j==0){
						isWrite=-1;
						break;
					}
					else isWrite=target;
				}
			}

			if(isWrite==-1){
				// System.out.println(target+" is denied");
				continue;
			}
			else if(isWrite>1){
				primeArray[i]=isWrite;
				++i;
				System.out.println(Thread.currentThread().getName()+" : " +target+" is accepted");
			}
		}
	}

	synchronized void sortPrintPrimeArray(){
		// Arrays.sort(primeArray);

		System.out.println("\nSearch is finished");
		for(int i=0;i<capacity;++i){
			System.out.println("Prime["+ i +"] : " + primeArray[i]);
		}
	}
}

class WorkerThread extends Thread {
	SyncObject sObj;

	WorkerThread(String name, SyncObject sObj) {
		super(name);
		this.sObj = sObj;
	}

	public void run() {
		sObj.prime();
	}
}