package sindhu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {


		String regexe = "[a-z]*\\.[a-z]*\\@gmail.com";
		String input  = "sindhusha.ganesh@gmail.com";
		Pattern pattern = Pattern.compile(regexe);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find())
		{
			System.out.println("matching is found");
		}
		
		else
		{
			System.out.println(" No matchings found");
		}

	}

}
