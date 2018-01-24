package euler;

public class Problem6 {
	public static void main(String[] args) {
		int sumAdd=0;
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sumAdd += i*i;
			sum += i;
		}
		sum = sum*sum;
		System.out.println(sum - sumAdd);
	}

}
