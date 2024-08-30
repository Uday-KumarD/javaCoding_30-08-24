package codingExam;

import java.util.Scanner;

public class OddNums {

	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.println("\nOdd Array Elements...\n");
		for(int o:a)
		{
			if(o%2==1)
				System.out.println(o);
		}
  }
}
