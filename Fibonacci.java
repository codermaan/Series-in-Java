package series;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int res = Fib(n);
		System.out.print(res);
		s.close();
	}

	private static int Fib(int n) {
		if(n<=1)
			return n;
		else
			return Fib(n-1)+Fib(n-2);
	}
}
