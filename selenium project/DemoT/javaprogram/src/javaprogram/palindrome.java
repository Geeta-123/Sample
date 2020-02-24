package javaprogram;


public class palindrome 
{
	public static boolean reversestring(String str)
	{
		String str1="";
		int j=0;
		for(int i=str.length()-1;i>0;i++)
			while(i<j) 
			{
				if(str.charAt(i)!=str.charAt(j))
					return false;
	i++;
	j--;
	}
	return true;
}
	
public static void main(String[] args)
		{
			String str="ababhj";
			if(reversestring(str))
					System.out.println("yes");
					else
				System.out.println("no");
		}
}
	
	