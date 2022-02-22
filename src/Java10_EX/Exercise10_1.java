package Java10_EX;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		for(int i=0; i<12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println("weekday =" + weekday );
			int secondSunday = (weekday ==1) ? 8:16-weekday;//2��°�Ͽ���, �Ͽ����� 1, �������� 2...
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
	}

}