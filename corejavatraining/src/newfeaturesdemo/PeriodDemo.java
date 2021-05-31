package newfeaturesdemo;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class PeriodDemo {

	public static void main(String[] args) {
		
		/*LocalDate today=LocalDate.now();
		LocalDate joiningDate = LocalDate.of(2021, 05,05);
		Period period = Period.between(today, joiningDate);
		System.out.println("year "+period.getYears()+ "month "+period.getMonths()+"day"+period.getDays());*/
		
		
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		System.out.println("Enter your DOB: ");
		String str = sc.nextLine();
		LocalDate date = LocalDate.parse(str);
		
		Period period = Period.between(date, today);
		System.out.println("year: "+period.getYears() +", month: "+period.getMonths() +", days: "+period.getDays());;
		
	}

}
