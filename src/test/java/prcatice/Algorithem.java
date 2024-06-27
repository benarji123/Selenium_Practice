package prcatice;

import java.util.Arrays;

public class Algorithem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s="my name is archit";
//		String re="";
//		for(int i=0;i<s.length();i++) {
//			re=s.charAt(i)+re;
//			if(s.charAt(i)==' ') {
//				System.out.print(re);
//				re=" ";
//				
//			}
//		
//		
//		}
//		System.out.print(re);
//
//		int[]obj= {1,2,3,3,4,1,6,6,6,2,3,7,1,1,3};
//		int c=0;
//		for(int i=0;i<obj.length;i++) {
//			
//			if(obj[i]==3)
//			{
//				int n=obj[0+c];
//				obj[0+c]=obj[i];
//				
//				obj[i]=n;
//				c++;
//			}
//		}
//		System.out.println(Arrays.toString(obj));
		
		// Example input arrays
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3; // Number of initial elements in nums1
//        int[] nums2 = {2, 5, 6};
//        int n = 3; // Number of elements in nums2
//
//        // Pointers for nums1, nums2, and the merged array
//        int p1 = m - 1;//2
//        int p2 = n - 1;//2
//        int p = m + n - 1;//5
//
//        // Loop to merge the arrays from the end
//        while (p1 >= 0 && p2 >= 0) {
//            if (nums1[p1] > nums2[p2]) {
//                nums1[p] = nums1[p1];
//                p1--;
//            } else {
//                nums1[p] = nums2[p2];
//                p2--;
//            }
//            p--;
//        }
//
//        // Copy remaining elements of nums2 if any
//        while (p2 >= 0) {
//            nums1[p] = nums2[p2];
//            p--;
//            p2--;
//        }
//
//        // Print the merged array
//        System.out.println("Merged array: ");
//        for (int num : nums1) {
//            System.out.print(num + " ");
//        }
// 
		int[]ob = {2,7,11,15,6,3};
		
		for(int i=0;i<ob.length;i++) {
			for(int j=i+1;j<ob.length;j++) {
				if(ob[i]+ob[j]==9) {
					System.out.println( i+" " +j);
				}
			}
		}
	}
}
