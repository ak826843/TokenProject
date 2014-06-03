import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmailMaskingExample {
	public static void main(String[] args) {
		// "(.{2}).+@.+(.{2}(?:\\..{2,3}){1,2})";
		String regex = "(.{1}).+(@.*)({1,2})";//"^([^@]*)(@.*)";

		String replace = "$1*$2";//"$1*@*$2";

		List<String> tests = new ArrayList<String>(Arrays.asList(new String[] {
				"joe@example.com", "jim@bob.com",
				"susie.snowflake@heretoday.co.uk", "j@b.us", "bc@nh.us","javaindia@gmail.com","james.bond@gmail.com" }));
		
		for(String test : tests)
		{
			System.out.println(test.replaceFirst(regex, replace));
		}
	}
}
