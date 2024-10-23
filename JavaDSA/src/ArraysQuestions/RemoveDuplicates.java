package ArraysQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	/**
	 * 
	 * 
	 * Remove duplicates from array
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9 };
		System.out.println(removeDuplicates(arr));

	}

	public static Set<Integer> removeDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();

		for (int num : arr) {
			set.add(num);

		}

		return set;
	}

}
