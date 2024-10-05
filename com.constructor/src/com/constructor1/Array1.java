package com.constructor1;

public class Array1 {
	
	public static void main(String[] args) {
		int age = 89;
		int marks[] = new int[6];
		
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;
		marks[3] = 80;
		marks[4] = 90;
		marks[5] = 100;
		
		//System.out.println(marks[5]);
		System.out.println("for");
		for(int i=0;i<6;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("for each");
		for(int uday:marks) {
			System.out.println(uday);
		}
	}

}
