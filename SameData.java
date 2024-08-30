package codingExam;

public class SameData {

	public static void main(String[] args)
	{
		String s1 = "Uday";
		String s2 = "Uday";
		String s3 = "Kumar";
		boolean equ1 = s1.equals(s2);
		boolean equ2 = s1.equals(s3);
		System.out.println("'" + s1 + "' equals '" +s2 + "' ? " + equ1);
		System.out.println("'" + s1 + "' equals '" +s3 + "' ? " + equ2);
	}
}
