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
			date = "�Ͽ���";
			break;
		case 2:
			date = "������";
			break;
		case 3:
			date = "ȭ����";
			break;
		case 4:
			date = "������";
			break;
		case 5:
			date = "�����";
			break;
		case 6:
			date = "�ݿ���";
			break;
		case 7:
			date = "�����";
			break;
		}

		System.out.println(date);
	}
}
