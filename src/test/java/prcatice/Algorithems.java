package prcatice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Algorithems {

public static void main(String[] args) {
//	String s="narada benarji";
//	String rs="";
//	for(int i=0;i<s.length();i++) {
//		rs=s.charAt(i)+rs;
//		 
//	}
//	System.out.println(rs);
//	int number=12345;
//	int r=0;
//	while(number>0) {
//		 r=r*10+number%10;
//		 number=number/10;
//		
//	}
//	System.out.println(r);
//	String sentence="hi this is narada benarji from ichapuram";
//	String[] n = sentence.split(" ");
//	System.out.println(Arrays.toString(n));
	
//	int number=2;
//	boolean isprimenumber=false;
//	if(number>2) {
//    for(int i=2;i<=number/2;i++) {
//    	if(number%i==0) {
//    		isprimenumber=true;
//    		break;
//    	}
//    	
//    }
//    if(isprimenumber) {
//		System.out.println("its not a primenumber");
//	}else {
//		System.out.println("its a primenumber");
//	}
//	}
//	else {
//		System.out.println("its a prime number");
////	}
//	int count=0;
//	for(int i=1;i<=100;i++) {
//		boolean isprimenumber=true;
//		
//		if(i==1||i==2) {
//			System.out.println(i+" its a prime number");
//			count=count+1;
//		}else {
//			for(int j=2;j<i;j++) {
//			if(i%j==0) {
//				//System.out.println(i+" its not a prime number");
//				isprimenumber=false;
//				break;
//			}
//			
//		}
//		if(isprimenumber) {
//				System.out.println(i+" its a prime number");
//				count=count+1;
//			}
//			
//		}
//		
//	}
//	System.out.println(count);
//	
   List<Integer> l=Arrays.asList(20,3,11,6,7,8,9,10,1);
   
//   for(int i=0;i<l.size()/2;i++) {
//	   for(int j=l.size()-1-i;j>=l.size()/2;) {
//		   System.out.println(l.get(i)+" "+l.get(j));
//		   break;
//	   }
//   }
//   int maxNumber = l.get(0);
//   for(int i=0;i<l.size();i++) {
//      if(l.get(i)<maxNumber) {
//    	  maxNumber=l.get(i);
//      }
//   }
//System.out.println(maxNumber);
//}
   String s="hi this is narada benarji ";
 //  HashMap<String, Integer> hashMap = new HashMap<>();
//   int count = 0;
//    char targetl = 'i';
//   for(int i=0;i<s.length();i++) {
//	   
//	   if(targetl==s.charAt(i)) {
//		   count=count+1;
//	   }
//   }
//   System.out.println(count);
//}

//   int[] obj=new int[2];
   int[]obj1= {90,83,20,4,2,4,1,0};
//   int[][] obj2=new int[2][4];
//   System.out.println(Arrays.toString(obj1));
//   List i=new ArrayList<>();
//  Map<String,Integer> m=new HashMap<>();
//  List ll=new LinkedList<>();
//  ll.add(Arrays.asList(obj1));
//   int[]a=new int[2];
   for(int i=0;i<obj1.length;i++) {
	   for(int j=i+1;j<obj1.length;j++) {
//		  if( obj1[i]>obj1[j]) {
//			  int n=obj1[j];
//			  obj1[j]=obj1[i];
//			  obj1[i]=n;
//			  
//		  }
		   if(obj1[i]<obj1[j]) {
			   int n=obj1[j];
			   obj1[j]=obj1[i];
			   obj1[i]=n;
		   }
	   }
   }
   
   System.out.println(Arrays.toString(obj1));
}

private static int obj1(int j) {
	// TODO Auto-generated method stub
	return 0;
}}
