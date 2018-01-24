package euler;

public class Problem7 {
	public static int[] a;
	public static int idx = 0;
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int midx = 10001;
		a = new int[midx];
		findPrime(midx);
		System.out.println("1001번째 소수: " +a[midx-1]);
	}
	/*시간 복잡도 O(n루트n이상)*/
	public static void findPrime(int n) {
		int num=2;
		while(idx < n) {
			/*시간 복잡도 O(루트n)*/
			if(isprime(num)) {
				//System.out.println(num);
				a[idx++] = num;
			}
			num++;
		}
	}
	/*시간 복잡도 O(루트n)*/
	public static boolean isprime(int n) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n %i==0)
				return false;
		}
		return true;
	}
}
