package Com_Eluer;

import java.util.Scanner;

public class MagicShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3;
		float rs1,rs2,rs3;
		float avgrating;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the people who watched show 1");
		s1=sc.nextInt();
		System.out.println("Enter the average for show 1");
		rs1=sc.nextFloat();
		System.out.println("Enter the people who watched show 2");
		s2=sc.nextInt();
		System.out.println("Enter the average for show 2");
		rs2=sc.nextFloat();
		System.out.println("Enter the people who watched show 3");
		s3=sc.nextInt();
		System.out.println("Enter the average for show 3");
		rs3=sc.nextFloat();
		float avg=s1*rs1+s2*rs2+s3*rs3;
		avgrating=avg/1000;
		System.out.println("The overall average rating for the show is"+avgrating);
		
		

	}

}
