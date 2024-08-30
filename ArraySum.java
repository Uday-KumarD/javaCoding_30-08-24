package codingExam;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l]; 
		int sum = 0; 
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		} 
		for(int e:a)
		{
			sum = sum + e;
		}
		System.out.println("Sum of Array Elements : "+sum);
  }
}
