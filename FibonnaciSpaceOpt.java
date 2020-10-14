package series;

import java.util.Scanner;

public class FibonnaciSpaceOpt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int res = Fib(n);
		System.out.print(res);
		s.close();
	}
	private static int Fib(int n) {
		int pre2=0, pre1=1, curr = 0;
		if(n<=1)
			return n;
		
		for(int i=2; i<=n; i++) {
			curr=pre1+pre2;
			pre2=pre1;
			pre1=curr;
		}
		return curr;
	}
}
