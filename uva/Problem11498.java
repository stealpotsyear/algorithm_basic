package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//나눠진 영역 구하기
public class Problem11498 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int k = Integer.parseInt(bf.readLine());
			if (k==0)
				break;
			
			String[] str = bf.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			
			for(int i=0; i<k; i++){
				str = bf.readLine().split(" ");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				WhereIs(n, m, x, y);
			}
		}
	}
	public static void WhereIs(int n, int m, int x, int y) {
		if(n==x || m==y) {
			System.out.println("divisa");
		}else if(x<n && m<y) {
			System.out.println("NO");
		}else if(x<n && m>y) {
			System.out.println("SO");
		}else if(x>n && m<y) {
			System.out.println("NE");
		}else if(x>n && m>y) {
			System.out.println("SE");
		}
	}
}
