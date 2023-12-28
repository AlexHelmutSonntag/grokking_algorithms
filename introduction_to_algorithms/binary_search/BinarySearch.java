package introduction_to_algorithms.binary_search;

public class BinarySearch {

	public static int binarySearch(int[] arr, int item) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = arr[mid];

			if (guess == item) {
				return mid;
			}
			if (guess < item) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };
		System.out.println(binarySearch(arr, Integer.parseInt(args[0])));
	}
}