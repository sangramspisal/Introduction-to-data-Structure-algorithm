package com.chapter3;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,4,3,1,9,56,6};
		System.out.println(Arrays.toString(new InsertionSort().insertionSort(a)));

	}
	public int[] insertionSort(int a[]){
		for(int i=1;i<a.length;i++){			
			
			while(i>0 && a[i]<a[i-1]){		
			        int temp =a[i-1];
					a[i-1]=a[i];
					a[i]=temp;
					i--;
			}		
			
			
		}
		return a;
		
	}

}
