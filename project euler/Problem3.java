package euler;

public class Problem3 {
	public static void main(String[] args) {
		//long n = 13195;
		long n = 600851475143l;
		int i=1;
		long max = 0;
		
		while(i<=n) {
			if(n%i==0) {
				n /= i;
				max = i;
			}
			i++;
		}
		System.out.println(max);
	}
}
