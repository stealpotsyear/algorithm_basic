package uva;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//UVa 272
public class Problem272 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input ="";
		boolean first = true;
		while((input = bf.readLine()) != null) {
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i) =='"')
					if(first) {
						input = input.substring(0, i) + "``" + input.substring(i+1, input.length());
						first = false;
					}else {
						input = input.substring(0, i) + "''" + input.substring(i+1, input.length());
						first = true;
					}
			}
			System.out.println(input);
		}
	}
}
