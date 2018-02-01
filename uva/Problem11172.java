package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11172 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		while(n-->0) {
			String[] str = bf.readLine().split(" ");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			if(a-b > 0)
				System.out.println(">");
			else if(a-b <0)
				System.out.println("<");
			else if(a-b == 0)
				System.out.println("=");
		}
	}
}
