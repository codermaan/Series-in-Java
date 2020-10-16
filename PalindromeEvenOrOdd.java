package strings;
import java.util.Scanner;
public class S3PalindromeEvenOrOdd {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		while(t-->0)
		{
			String a=s.next();
			String b="";
			for(int i=a.length()-1; i>=0; i--)
			{
				b= b + a.charAt(i);
			}
			if(a.equals(b))
			{
				System.out.print("YES ");
				if(a.length()%2==0)
					System.out.println("EVEN");
				else
					System.out.println("ODD");	
			}
			else
				System.out.println("NO");
		}
		s.close();
	}
}
