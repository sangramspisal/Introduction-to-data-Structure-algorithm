package com.chapter3.assignment1;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(5,"sangram","pisal","sangram_pisal@yahoo.com");
		Employee e2=new Employee(4, "A", "D", "B");
		Employee e3=new Employee(3, "C", "K", "B");
		Employee e4=new Employee(2, "B", "B", "B");
		Employee e5=new Employee(1, "V", "B", "B");
		Employee arr[]={e1,e2,e3,e4,e5};
		System.out.println(Arrays.toString(new Tester().insertionSort(arr)));
		

	}
	public static Employee[] insertionSort( Employee arr[]){
		/*int j,temp;
		for(int i=1;i<arr.length;i++){
			j=i-1;
			while(j>=0 && arr[i].getEmpID()<arr[j].getEmpID()){
				temp=arr[i].getEmpID();
				arr[i].setEmpID(arr[j].getEmpID());
				arr[j].setEmpID(temp);
				j--;
				i--;
			}
		}*/
		int temp;
		for(int i=1;i<arr.length;i++){
			
			while(i>0 &&arr[i].getEmpID()<arr[i-1].getEmpID()){
				temp=arr[i-1].getEmpID();
				arr[i-1].setEmpID(arr[i].getEmpID());
				arr[i].setEmpID(temp);
				i--;
			}
		}
			
		return arr;
		}
		
	

}
