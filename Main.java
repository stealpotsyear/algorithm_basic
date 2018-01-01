import java.io.BufferedReader;
import java.io.InputStreamReader;
//Problem 1
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double d = Double.parseDouble(bf.readLine());
		
		System.out.printf("%7.3f", d);
	}
}
