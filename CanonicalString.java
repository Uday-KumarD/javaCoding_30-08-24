package codingExam;

public class CanonicalString {
	public static void main(String[] args)
	{
		String str1 = "Uday Kumar";
		String str2 = new StringBuffer("Uday").append(" Kumar").toString();
		String str3 = str2.intern();
 
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 == str3 ? " + (str1 == str3));
	}

}
