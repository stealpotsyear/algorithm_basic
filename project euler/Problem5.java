package euler;

//나누어 떨어지는 수.
public class Problem5 {
	public static void main(String[] args) {
		/* 1~20 사이 어떤 수로도 나누어 떨어지는 수 구하기 */
		int max = 20;
		long res = 1;
		/*시간복잡도 O(N2logn)*/
		for(int i=1; i<=max; i++) {
			if(isprime(i)) {
				//소수의 지수승의 최대값을 곱한다.
				res *= inexp(i, max);
			}
		}
		System.out.println("res :" + res);
	}
	/*시간복잡도 O(n)*/
	public static boolean isprime(int n) {
		if(n==1)
			return false;
		for(int i=2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	/*시간복잡도 O(log n)*/
	public static int inexp(int n, int max) {
		for(int i=n; i<=max; i=i*i) 
			n = i;
		return n;
	}
}
