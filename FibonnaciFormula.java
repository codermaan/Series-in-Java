//O(1) Space and time complexity
package series;

import java.util.Scanner;

public class FibonnaciFormula {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int res = Fib(n);
		System.out.print(res);
		s.close();
	}

	private static int Fib(int n) {
		double val = (1 + Math.sqrt(5))/2;
		return (int) Math.round(Math.pow(val,n)/Math.sqrt(5));
	}
}
