package codingExam;

public class CompareSpecified {

	public static void main(String[] args)
	{
		String str1 = "Uday Kumar FullStack";
		String str2 = "Java FullStack";
		CharSequence cs = "FullStack";
		System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
		System.out.println("Comparing '"+str2+"'"+" and '"+cs+"' :"+ str2.contentEquals(cs));
	}
}
