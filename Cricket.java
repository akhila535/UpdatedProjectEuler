package Com_Eluer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int overs,tr,ob,rs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of overs");
		overs=sc.nextInt();
		System.out.println("Enter the Target runs");
		tr=sc.nextInt();
		System.out.println("Enter the overs bowled");
		ob=sc.nextInt();
		System.out.println("Enter the runs Scored");
		rs=sc.nextInt();
		
		float crr;
		crr=rs/ob;
		System.out.println("Current run rate="+crr);
		
		int rovers;
		rovers=tr-rs;
		
		
		int oversremaining;
		oversremaining=overs-ob;
		System.out.println("The overs Remaining "+oversremaining);
		float rrr;
		rrr=rovers/oversremaining;
		System.out.println("The run rate required after 10 overs"+rrr);
		
		
		
	}

}
