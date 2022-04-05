package gitJavaProgram;

public class Program1 {
	public int countLetters(String input)
	{
		return input.length();
		
	}
	
	
	public static void main(String args[])
	{
		Program1 obj = new Program1();
		System.out.print(obj.countLetters("Hello"));
	}

}
