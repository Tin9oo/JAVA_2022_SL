import java.util.Vector;
import java.lang.Math;
import java.util.*;
public class vectorcollection {
	static int findMax(Vector<Integer> v) {
		int max=0;
		
		for(int i=0; i<v.capacity(); ++i) {
			if(v.get(i)>max) {
				max=v.get(i);
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(20);
		
		for(int i=0; i<v.capacity(); ++i) {
			v.add((int)(Math.random()*901+100));
		}
		
		System.out.print("Before sorting : ");
		for(int i=0; i<v.capacity(); ++i) {
			System.out.print(v.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Max : " + findMax(v));
		System.out.println("min : " + Collections.min(v));
		Collections.sort(v);
		
		System.out.print("After sorting : ");
		for(int i=0; i<v.capacity(); ++i) {
			System.out.print(v.get(i) + " ");
		}
		
	}
}
