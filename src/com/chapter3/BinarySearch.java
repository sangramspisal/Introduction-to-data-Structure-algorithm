package com.chapter3;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,67};
		int b = 5;

		binarySearch(a,b);

		int index = binarySearchRecursive(a, 0, a.length - 1, b);
		System.out.println(index);
	}

	private static int binarySearchRecursive(int[] arr, int start, int end, int b) {
		// Base Case
		if (start > end)
			return -1;//not found

		int mid = (start + (end)) / 2;

		if (arr[mid] > b) {
			return (binarySearchRecursive(arr, 0, mid - 1, b));
		} else if (arr[mid] < b) {
			return (binarySearchRecursive(arr, mid + 1, end, b));
		} else {
			return mid;
		}
	}

	public static int binarySearch(int a[], int b) {
		int first = 0;
		int last = a.length - 1;
		while (first <= last) {
			int m = (first + last) / 2;
			if (a[m] == b) {
				System.out.println("number found at location " + m);
				return m;
			} else if (a[m] < b) {
				first = m + 1;
			} else {
				last = m - 1;
			}
		}
		System.out.println("number is not available in array:");
		return -1;
	}
}