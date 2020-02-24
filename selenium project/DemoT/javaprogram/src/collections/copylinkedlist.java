package collections;

import java.util.LinkedList;

public class copylinkedlist 
{
	public static void main(String[] args)
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("Actual linkedlist:"+al);
		String[] str=new String[al.size()];
		al.toArray(str);
		System.out.println("created array content:");
		for(String str1: str)
		{
			System.out.println(str1);
		}
	}
}
