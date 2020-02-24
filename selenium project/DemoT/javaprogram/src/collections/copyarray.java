package collections;

import java.util.ArrayList;

public class copyarray 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("Actual arraylist:"+al);
		String[] str=new String[al.size()];
		al.toArray(str);
		System.out.println("created array content:");
		for(String str1:str)
		{
			System.out.println(str1);
		}

}
}
