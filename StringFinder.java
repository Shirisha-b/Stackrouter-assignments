import java.util.Scanner;
public class StringFinder {
	public static int stringFinder(String s1,String s2,String s3)
	{
		int l=0;
		if(s1.contains(s2)&& s1.contains(s3))
		{
		if(s1.indexOf(s2)<s1.indexOf(s3))
		{
		l=1;
		}
		else
		l=2 ;
	}
	return l;
	}
     public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s1=in.nextLine();
	String s2=in.nextLine();
	String s3=in.nextLine();
	int ans=StringFinder.stringFinder(s1,s2,s3);
	if(ans==1)
		System.out.println("1");
	else
		System.out.println("0");
	
		
	in.close();
	}
}
