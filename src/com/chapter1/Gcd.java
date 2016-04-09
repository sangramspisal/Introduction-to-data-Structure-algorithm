package com.chapter1;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=50;
		System.out.println("Gcd of two number is:");
		System.out.println(new Gcd().gcdFinder(a,b));
		System.out.println("Lcm of two number is:");
		System.out.println(new Gcd().lcmFinder(a,b));

	}
	public int gcdFinder(int a,int b){
		if(b==0){
			return a;
		}
		return gcdFinder(a, a%b);
		}
	public int lcmFinder(int a,int b){
		return ((a/gcdFinder(a, b))*(b/gcdFinder(a, b))*(gcdFinder(a, b)));
	}

}
