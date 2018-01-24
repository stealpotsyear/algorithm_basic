package euler;

public class Problem2 {
	public static void main(String[] args) {
		int n = 0;
		int a=0;
		int sum=0;
		while((a = fib(n)) <= 4000000) {
			if(a%2==0) {
				sum += a;
				//System.out.println("값 : " +a);
			}
				
			n++;
			
		}
		System.out.println(sum);
	}
	
	public static int fib(int n) {
		if(n==0)
			return 1;
		else if(n==1)
			return 2;
		else
			return fib(n-1) + fib(n-2);
	}
}
