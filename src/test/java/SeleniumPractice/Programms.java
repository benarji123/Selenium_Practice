package SeleniumPractice;

import java.util.HashMap;
import java.util.Map;

public class Programms {

	public static void main(String[] args) {
//		String s="narada";
//		
//		Map<Character, Integer>m=new HashMap<>();
//		
//		for(int i=0;i<s.length();i++) {
//			if(m.containsKey(s.charAt(i))) {
//			  m.put(s.charAt(i), m.get(s.charAt(i))+1);
//			}
//			else {
//				m.put(s.charAt(i), 1);
//			}
//		}
//		//System.out.println(m);
//		
//		for(Map.Entry<Character, Integer> mp:m.entrySet()) {
//			if(mp.getValue()>1) {
//				System.out.println(mp.getKey()+"="+mp.getValue());
//			}
//		}
//		
//		int n=3;
//		int flage=0;
//		if(n==0&&n==1) {
//			System.out.println("prime number");
//		}else {
//			for(int i=2;i<=n/2;i++) {
//				if(n%i==0) {
//					System.out.println("not prime number");
//					flage=1;
//					break;
//				}
//			}
//		}
//		if(flage==0) {
//			System.out.println("prime number");
//		}
//	}
//	
//	 int number=1234;
//	 int reversNumber=0;
//	 int rem;
//	 while(number!=0) {
//		 rem=number%10;
//		 reversNumber=reversNumber*10+rem;
//		 
//		 number=number/10;
//				 
//	 }
//	 System.out.println(reversNumber);
//	}
		//1 1 2 3 4
		int arr[]= {1,1,2,3,4};
		
		for(int i=1; i<arr.length;i++) {
			int temp=i-1;
			if(temp==arr[i]) {
				System.out.println("contains duplicate");
				break;
			}
		}
		
		
}

}