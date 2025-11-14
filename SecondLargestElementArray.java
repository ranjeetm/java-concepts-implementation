/*Second Largest
Given an array of positive integers arr[], 
return the second largest element from the array. 
If the second largest element doesn't exist then return -1.*/

public class SecondLargestElementArray {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 20, 1, 2 };
		int result = SecondLargest(arr);
		System.out.println(result);

	}

	public static int SecondLargest(int[] arr) {
		int max = Integer.MIN_VALUE;
		int size;
		int secondLarge = Integer.MIN_VALUE;
		size = arr.length;
		if (size > 2) {
			for (int i = 0; i < size; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			for (int j = 0; j < size; j++) {
				if (arr[j] > secondLarge && secondLarge != max) {
					secondLarge = arr[j];

				}
			}

		}
		return secondLarge;

	}

}
