package collections;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println("after shuffling:");
		for(String str:al)
		{
			System.out.println(str);
		}

}
}
