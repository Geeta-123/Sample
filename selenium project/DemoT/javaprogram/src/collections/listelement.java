package collections;

import java.util.ArrayList;
import java.util.List;

public class listelement 
{
	public static void main(String[] args)
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		List<String> list=new ArrayList<String>();
		list.add("B");
		list.add("C");
		System.out.println("Does arraylist contains all list of elements?"+ar.containsAll(list));
		list.add("Z");
		System.out.println("Does arraylist contains all list of elements?"+ar.containsAll(list));
	}

}
