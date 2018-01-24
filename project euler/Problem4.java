package euler;

//대칭수
public class Problem4 {
	public static void main(String[] args) {
		int res =0;
		for(int i=100; i<1000; i++) {	// n = 900
			for(int j=100; j<1000; j++) {	// n = 900
				int num = i*j;
				String str = num+"";
				if(isPalin(str) && num > res)
					res = num;
			}
		}
		System.out.println(res);
	}
	public static boolean isPalin(String str) {
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}

}
