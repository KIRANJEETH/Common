package dump;
import java.util.*;
public class Fibonacci {
	public static int Fibo(int n) {
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return Fibo(n-1)+Fibo(n-2);
	}
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		System.out.println(Fibo(num));
	}
}
