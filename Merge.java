package codingExam;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the First Array Limit :");
		int n =input.nextInt();
		System.out.print("Enter the Second Array Limit :");
		int m =input.nextInt();
		int [] a =new int[n];
		int [] b =new int[m];
		int [] c =new int[100];
		int k=0;
		for(int i=0;i<n;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			System.out.printf("Element of b[%d] :",i);
			b[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[k] = a[i];
			k++;
		}
		for(int i=0;i<m;i++)
		{
			c[k] = b[i];
			k++;
		}
		System.out.print("\nMerge two Array Elements ...\n");	
		for(int i=0;i<k;i++)
		{
			System.out.printf("\nc[%d] = %d",i,c[i]);
		}
  }
}
