package com.chapter2;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,4,3,2,1};
		System.out.println(Arrays.toString(new BubbleSort().bubbleSort(a)));

	}
	public int[] bubbleSort(int a[]){
		int temp;
		for(int i=0;i<a.length-1;i++){
		for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
		}
		return a;
		
	}

}
