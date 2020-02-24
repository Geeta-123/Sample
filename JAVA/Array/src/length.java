
public class length 
{
	public static void main(String[] args)
	{
		int[] a=new int[3];
		System.out.println(a.length);
		System.out.println(a[0]);
		a[0]=20;
		a[1]=40;
		a[2]=30;
		System.out.println("----------------");
		for (int i=0;i<=a.length;i++) 
		{
			System.out.println("a["+i+"]:"+a[i]);
		}
	}
}

