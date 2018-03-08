package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem11727 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine());
		
		int[] a = new int[3];
		for(int i=1; i<=t; i++) {
			String[] str = bf.readLine().split(" ");			
			for(int j=0; j<3; j++)
				a[j] = Integer.parseInt(str[j]);

			Arrays.sort(a);
			System.out.println("Case " + i + ": "+a[1]);			
		}
	}
}
