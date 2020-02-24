package pgrm;

public class remove
{
	String New="";
	String x="hello";
	char ch[]=New.toCharArray();
	char ch1[]=x.toCharArray();
	{
	for(int i=0;i<ch1.length;i++)
	{
		int count=0;
		for(int j=0;j<ch1.length;j++)
			if(ch1[i]==ch1[j])
				count++;
		if(count==0)
			New=New+ch1[i];
	}
	

}
}
