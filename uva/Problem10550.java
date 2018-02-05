package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10550 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] str =bf.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			int d = Integer.parseInt(str[3]);
			
			if(a == 0 && b == 0 && c == 0 && d == 0) 
				break;
			int res = 1080;
			
			res += (a-b)*9;
			
			if(a<b)
				res += 360;
			res += (c-b)*9;
			
			if(b>c)
				res += 360;
			
			res += (c-d)*9;
			
			if(c<d)
				res += 360;
						
			System.out.println(res);
		}
	}

}
