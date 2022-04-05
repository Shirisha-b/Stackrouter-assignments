import java.util.Scanner;
public class PhoneNumberValidator {
	public static int validatePhoneNumber(String s1)
	{
		int l=0;
		for(int i=0;i<s1.length();i++)
		{
		char c=s1.charAt(i);
		if(Character.isDigit(c))
		{
			++l;
		}else if (c!='-')
			break;
		}
		if(l==10)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s1=in.nextLine();
	int ans=PhoneNumberValidator.validatePhoneNumber(s1);
	if(ans==1)
		System.out.println("valid");
	else
		System.out.println("invalid");
	    in.close();
	}
}
