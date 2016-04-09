package com.chapter3;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]={7,3,6,8,2};
		System.out.println(Arrays.toString(new SelectionSort().selectionSort(a)));

	}
	public int[] selectionSort(int a[]){
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
		}
		return a;
	}

}
