import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDayOfGivenMonthYear {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.DAY_OF_MONTH, 1);// This is necessary to get proper
											// results
		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		cal.getTime();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(dateFormat.format(cal.getTime().getTime()));

	}

}
