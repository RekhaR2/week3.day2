package week3.day2.assignments.mandatory;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

		public static void main(String[] args) {

			// Here is the input
			int[] data = {3,2,11,4,6,7};
			FindSecondLargest(data);
			
			
			/*
			 Pseudo Code:
			 1) Arrange the array in ascending order
			 2) Pick the 2nd element from the last and print it
			 */
			

			
		}

		private static void FindSecondLargest(int[] data) {
			// TODO Auto-generated method stub
	
			Set<Integer> set = new TreeSet<Integer>();
			for (int i = 0; i < data.length; i++) {
				set.add(data[i]);
				
			}
			System.out.println(set);
			int size = set.size();
			//System.out.println(size);
			for (int i = size-1; i>0; i++) {
				System.out.println("Second largest number in the array is " +data[i]);
				break;
			}
			
			
			
		}

}
