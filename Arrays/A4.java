package Arrays;

import java.util.Arrays;

public class A4 {
	static int arr[] = new int[] { 1, 2, 3, 4, 5 };

	// Method for rotation
	static void rotate()
	{
		int last_el = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = last_el;
	}

	/* Driver program */
	public static void main(String[] args)
	{
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));

		// Function Call
		rotate();

		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}
}
