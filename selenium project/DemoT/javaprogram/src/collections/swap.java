package collections;

import java.util.ArrayList;
import java.util.Collections;

public class swap 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println("after swap:"+al);
		Collections.swap(al,1,3);
		System.out.println("created array:");
		for(String str:al)
		{
			System.out.println(str);
		}
		

}
}
