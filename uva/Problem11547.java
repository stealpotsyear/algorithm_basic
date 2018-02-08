package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11547 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(bf.readLine());
			System.out.println(Math.abs(((((n*63+7492)*5)-498)/10)%10));
		}
	}
}
