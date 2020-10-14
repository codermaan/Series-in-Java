package series;

import java.util.Scanner;

public class FibonnaciDP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int res = Fib(n);
		System.out.print(res);
		s.close();
	}

	private static int Fib(int n) {
		int d[] = new int[n+1];
		d[0]=0;
		d[1]=1;
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1]+d[i-2];
		}
		
		return d[n];
	}
}
