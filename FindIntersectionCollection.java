package week3.day2.assignments.mandatory;

import java.util.HashSet;

public class FindIntersectionCollection {

		public static void main(String[] args) {
			
			int[] arr1 = {3,2,11,4,6,7};
			int[] arr2 = {1,2,8,4,9,7};
			printIntersection(arr1,arr2);
		}

		private static void printIntersection(int[] arr1, int[] arr2) {
			// TODO Auto-generated method stub
			HashSet<Integer>set = new HashSet<Integer>();
			for (int i = 0; i < arr2.length; i++) {
				set.add(arr1[i]);
			}
			System.out.println("Intersection of two arrays ");
			for (int i = 0; i < arr2.length; i++) {
				if(set.contains(arr2[i]))
					System.out.println(arr2[i]);
			}
		}
}