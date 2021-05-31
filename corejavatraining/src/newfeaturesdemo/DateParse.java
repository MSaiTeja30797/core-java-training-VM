package newfeaturesdemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateParse {

	public static void main(String[] args) {
		String  startDate = "2021-05-07";
		LocalDate id = LocalDate.parse(startDate);
		System.out.println(id);
		String bookingDate = "2021/May/25";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMMM/dd");;
		System.out.println("date after parse: "+bookingDate);
	}

}