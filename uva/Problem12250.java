package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem12250 {
	public static void main(String[] args)  throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i=1;
		while(true) {
			String str = bf.readLine();
			
			if(str.equals("#"))
				break;
			String st = "";
			
			if(str.equals("HELLO"))
				st = "ENGLISH";
			else if(str.equals("HOLA"))
				st = "SPANISH";
			else if(str.equals("HALLO"))
				st = "GERMAN";
			else if(str.equals("BONJOUR"))
				st = "FRENCH";
			else if(str.equals("CIAO"))
				st = "ITALIAN";
			else if(str.equals("ZDRAVSTVUJTE"))
				st = "RUSSIAN";
			else
				st = "UNKNOWN";
			
			System.out.println("Case "+i+": "+ st);
			i++;
		}
	}
}
