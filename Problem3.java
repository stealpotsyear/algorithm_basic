import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Problem3 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String string = bf.readLine();

		int year = Integer.parseInt(string.substring(0, 4));
		int month = Integer.parseInt(string.substring(4, 6));
		int day = Integer.parseInt(string.substring(6, 8));

		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month-1, day);
		
		String date="";
		int dayNum = cal.get(Calendar.DAY_OF_WEEK);
		switch (dayNum) {
		case 1:
			date = "월요일";
			break;
		case 2:
			date = "화요일";
			break;
		case 3:
			date = "수요일";
			break;
		case 4:
			date = "목요일";
			break;
		case 5:
			date = "금요일";
			break;
		case 6:
			date = "토요일";
			break;
		case 7:
			date = "일요일";
			break;
		}

		System.out.println(date);
	}
}
