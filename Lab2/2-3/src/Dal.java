import java.util.Scanner;
public class Dal {
	enum Week {일요일, 월요일, 화요일, 수요일, 목요일, 금요일, 토요일}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		Scanner in=new Scanner(System.in);
		String start="";
		int sp=0;
		
		System.out.print("올해 1월 1일은 어떤 요일인가요? ");
		start = in.next();
		System.out.println();
		
		System.out.println("start : " + start);
		for(int l=0;l<day.length;++l) {
			if(start.equals(day[l])) {
				sp=l;
			}
			// System.out.println("l : " + l);
			// System.out.println("sp : " + sp);
		}
		
		
		for(int i=0;i<month.length;++i) {
			System.out.println();
			System.out.println(i+1 + "월");
			
			int cnt=0;
			int k=0;
			for(int j=0, date=0;date<=month[i];++j, ++k) {
				if(k==7) k=0;
				if(j<sp) {
					System.out.print("*");
					++cnt;
					continue;
				}
				
				
				
				System.out.print(++date+" ");
				if(++cnt%7==0) {
					System.out.println();
				}
				
				
				
				if(date==month[i]) {
					sp=k+1;
					System.out.println("sp : " + sp);
					break;
				}
				
				// System.out.println();
				// System.out.println("cnt : " + cnt);
			}
			// System.out.println();
		}
	}

}
