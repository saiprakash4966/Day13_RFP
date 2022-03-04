package com.bl;

import java.util.Arrays;

public class MaxValue
{
	public static void main(String[] args) 
	{
		Integer aI = 5, bI = 3, cI = 2;
		Float aF = 2.2f, bF = 6.5f, cF = 9.3f;
		String aS = "Apple", bS = "Peach", cS = "Banana";

		Integer[] arrInt = { aI,bI,cI };
		Float[] arrFlt = { aF, bF, cF };
		String[] arrStr = { aS, bS, cS };

		System.out.println("Before sort");
		printArray(arrInt);
		printArray(arrFlt);
		printArray(arrStr);

		/*
		 * sorting of an array
		 */
		Arrays.sort(arrInt);
		Arrays.sort(arrFlt);
		Arrays.sort(arrStr);

		printArraySort(arrInt);
		printArraySort(arrFlt);
		printArraySort(arrStr);

		System.out.println();
		testMaximum(aI, bI, cI);
		testMaximum(aF, bF, cF);
		testMaximum(aS, bS, cS);

	}

	private static <T> void printArraySort(T[] arr) {
		System.out.println("Sorted array[] is : " + Arrays.toString(arr));

	}

	/*
	 * Before sorting
	 */
	public static <S> void printArray(S[] arr) {
		Integer i;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/*
	 * Testing the maximum value
	 */
	private static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max;

		if (x.compareTo(y) == 1 && x.compareTo(z) == 1) {
			max = x;

		} else if (y.compareTo(x) == 1 && y.compareTo(z) == 1) {
			max = y;

		} else {
			max = z;
		}
		printMax(x, y, z, max);

		return max;
	}

	/*
	 * Printing the maximum value
	 */
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("max of %s,%s and %s is %s\n", x, y, z, max);
	}
}
