package InterviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractise {

	public static void main(String[] args) throws ParseException {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String g = sd.format(new Date());
		
		          Date date =  sd.parse(g);
		          
		          String year = new SimpleDateFormat("yyyy").format(date);
		          System.out.println(year);
		          String mon = new SimpleDateFormat("MM").format(date);
		          System.out.println(mon);
		          String day = new SimpleDateFormat("dd").format(date);
		          System.out.println(day);
		
		

	}

}
