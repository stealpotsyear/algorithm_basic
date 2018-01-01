import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		double pi = Math.PI;
		
		String str = "%."+n+"f";
		System.out.printf(str, pi);
		
	}
}
