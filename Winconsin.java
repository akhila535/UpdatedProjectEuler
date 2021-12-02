package Com_Eluer;

import java.util.Scanner;

public class Wisconsin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalsalary=2750;
		int WDS=80,WES=50,WD=10;
		int WDH,days,salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total salary");
		totalsalary=sc.nextInt();
		days=WDS*WD;
		System.out.println("The number of days"+days);
		salary=totalsalary-days;
		System.out.println("The number of salary"+salary);
		int hours;
		int WEH=WDS+WES;
		System.out.println("The number of working weekend hours"+WEH);
		hours=salary/WEH;
		System.out.println("the number of WeekEnd hours is"+hours);
		WDH=WD+hours;
		System.out.println("The number of Weekday hours is"+WDH);
		
		
		
		

	}

}
