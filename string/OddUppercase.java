package string;

public class OddUppercase {
	public static void main(String[] args) {
		
	
	String test="changeme";

	char[] charArray = test.toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
			if(i%2!=0)
			{
				charArray[i]=Character.toUpperCase(charArray[i]);
			
				System.out.println(charArray[i]);
			}

}
	for (int i=0;i<charArray.length;i++){

	System.out.println(charArray[i]);
	}
	
}

}
