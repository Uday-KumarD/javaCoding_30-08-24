package codingExam;

import java.util.Scanner;

public class AverageArray {

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
		for(int i=0; i < l ; i++)
			sum = sum + a[i];

		double ave = sum / l;
		System.out.println("Sum of Array Value : " + sum); 
		System.out.println("Average of Array Value : " + ave); 
  }
}
