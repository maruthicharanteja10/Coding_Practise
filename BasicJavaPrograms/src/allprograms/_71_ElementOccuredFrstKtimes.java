package allprograms;

import java.util.*;
public class _71_ElementOccuredFrstKtimes {
	public static void main(String[] args) {
		int[] a = { 12, 45, 1, 23, 77, 89, 23, 89 };
		int k = 2;
		Map<Integer, Integer> elementCount = new HashMap<>();
		Integer result = null;

		for (int element : a) {
			// Increment the count for each element
			elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);

			// Check if the current element occurs k times
			if (elementCount.get(element) == k) {
				result = element;
				break;
			}
		}
		if (result != null) {
			System.out.println("The first element that occurs " + k + " times is: " + result);
		} else {
			System.out.println("No element occurs " + k + " times in the array.");
		}
	}
}
