package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11364 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(bf.readLine());
			String[] str = bf.readLine().split(" ");
			int max = Integer.parseInt(str[0]);
			int min = Integer.parseInt(str[0]);
			for(int j=0; j<n; j++) {
				int tmp = Integer.parseInt(str[j]);
				if(max < tmp)
					max = tmp;
				if(min > tmp)
					min = tmp;
			}
			System.out.println(2*(max-min));
		}
	}

}
