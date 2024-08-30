package codingExam;

import java.util.Scanner;

public class UniqueEle {

	static void getUnique(int a[], int n)
	{
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < i; j++)
			if (a[i] == a[j])
				break;
			if (i == j)
			System.out.print( a[i] + " ");
		}
	}	
	public static void main (String[] args)
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
		System.out.println("\nDisplay Array Unique Elements...\n");
		getUnique(a, l);

	}
}
