package javaprogram;

public class revstring 
{
	public static void main(String[] args)
	{
		String str="This is my place";
		String str1="";
		String[] strArray=str.split(" ");
		for(String a:strArray)
		{
		for(int i=a.length()-1;i>=0;i--)
		{
			str1=str1+a.charAt(i);
		}
		System.out.print(str1);
			str1="";
		}
		
	}
	}
