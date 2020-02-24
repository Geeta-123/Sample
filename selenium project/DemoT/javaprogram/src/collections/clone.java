package collections;

import java.util.ArrayList;

public class clone 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		ArrayList<String> alclone= new ArrayList<>(al);
		System.out.println(alclone);
		
	}

}
