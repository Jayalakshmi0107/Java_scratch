package day4;

public class PrintWeekNamesUsingSwitchCase {

	public static void main(String[] args) {
		int week_no=3;
		switch(week_no)
		{
		case 1: System.out.println(week_no +" is Sunday"); break;
		case 2: System.out.println(week_no +" is Monday"); break;
		case 3: System.out.println(week_no +" is Tuesday"); break;
		case 4: System.out.println(week_no +" is Wednesday"); break;
		case 5: System.out.println(week_no +" is Thursday"); break;
		case 6: System.out.println(week_no +" is Friday"); break;
		case 7: System.out.println(week_no +" is Saturday"); break;
		default : System.out.println(week_no +" Invalid week Number");
		}

	}

}
