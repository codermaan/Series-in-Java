package strings;
import java.util.Scanner;
public class PalindromeByRecurssion {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		while(t-->0)
		{
			String a=s.next();
			boolean ans = isPalindrome(a,0);	
			System.out.println(ans);
		}
		s.close();
	}
	private static boolean isPalindrome(String a, int i) {
		int n = a.length()-1;
		if(i==n/2+1)
			return true;
		if(a.charAt(i)==a.charAt(n-i)) {
			return isPalindrome(a,i+1);
		}
		else
			return false;
	}
}
