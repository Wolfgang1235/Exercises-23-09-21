import java.util.Arrays;
class Main {
	
	public static void main(String args[]) {
		int[] nums = {3, 1, 2};
		String[] words = {"Apple", "Banana", "Citrus"};
		boolean[] bool = {false, false, true};

		int[] nums2 = new int [3]; // All values = 0
		String[] words2 = new String [3]; // All values = null
		boolean[] bool2 = new boolean [3]; // All values = false 

		printStringArray(words);

		System.out.println(sumIntArray(nums));

		System.out.println(averageIntArray(nums));

		System.out.println(Arrays.toString(lowestToHighest(nums)));
	}
	// 4.b Write a function that takes in an array of strings as parameter 
	// and prints each string.
	static void printStringArray(String[] words) {

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	// 4.c Write a function that receives an integer array as a parameter 
	// and returns the sum of all elements in the array.
	static int sumIntArray(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}

	// 4.d Write a function that receives an integer array as a parameter 
	// and returns the average value.	
	static int averageIntArray(int[] nums) {
		return sumIntArray(nums)/nums.length;
	}


	// 4.e Consider how you could write a function that takes in an integer array 
	// as a parameter and returns the array sorted from lowest to highest value.
	static int[] lowestToHighest(int[] nums) {
		int[] res = nums;
		Arrays.sort(res);
		return res;
	}
}



