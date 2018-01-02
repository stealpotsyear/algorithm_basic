import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] d = new int[n+1][n+1];
		for(int i=0; i<m; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			d[u][v] = d[v][u] = 1;
		}
		 
		boolean[] c = new boolean[n+1];
		int cnt=0;
		for(int i=1; i<=n; i++){
			if(!c[i]){
				dfs(d,c,i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static void dfs(int[][] d, boolean[] c, int st) {
		if (c[st])
			return;
		c[st] = true;
		for(int i=0; i<d[st].length; i++){
			if(d[st][i]==1 && !c[i])
				dfs(d,c,i);
		}
	}
}