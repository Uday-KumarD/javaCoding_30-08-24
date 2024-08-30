package codingExam;

public class EndsWith {

	public static void main(String[] args)
	{
		String str1 = "Uday Kumar";
		String str2 = "Dodda Uday Kumar";
 
		String e = "ar";
		boolean ends1 = str1.endsWith(e);
		boolean ends2 = str2.endsWith(e);
		System.out.println("'" + str1 + "' ends with " +"'" + e + "' ? " + ends1);
		System.out.println("'" + str2 + "' ends with " + "'" + e + "' ? " + ends2);
	}
}
