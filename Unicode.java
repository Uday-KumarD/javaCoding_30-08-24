package codingExam;

public class Unicode {

	public static void main(String[] args)
	{
		String str = "Uday Kumar";
		System.out.println("Given String : " + str);
		int v1 = str.codePointAt(2);
		int v2 = str.codePointAt(7);
		System.out.println("Character :"+str.charAt(0)+"\nUnicode Point : " + v1);
		System.out.println("Character :"+str.charAt(6)+"\nUnicode Point : " + v2);
	}
}
