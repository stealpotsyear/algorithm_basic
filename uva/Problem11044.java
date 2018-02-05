package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11044 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<t; i++) {
			String[] str = bf.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			
			System.out.println( (n/3) * (m/3) );
		}
	}
}
