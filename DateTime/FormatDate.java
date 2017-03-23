package DateTime;

import java.util.Date;

public class FormatDate {

	public static void main(String[] args) {
		Date date=new Date();
		String str=String.format("Current Date/time: %tc",date);
        System.out.println(str);
	}

}
