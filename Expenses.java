package Com_Eluer;

import java.util.Scanner;

public class Expensive {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int be,te,fe,le;
		float total;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter branding expenses");
		 be=sc.nextInt();
		 System.out.println("Enter the travel Expenses");
		 te=sc.nextInt();
		 System.out.println("Enter the food Expenses");
		 fe=sc.nextInt();
		 System.out.println("Enter the Logistics Expenses");
		 le=sc.nextInt();
		 total=be+te+fe+le;
		 
		 float BE,TE,FE,LE;
		 System.out.println("Total Expenses"+total);
		 BE=((be/total)*100);
		TE=((te/total)*100);
		 FE=((fe/total)*100);
		 LE=((le/total)*100);
		 System.out.println("The be is"+BE);
		 System.out.println("The fe is"+FE);
		 System.out.println("The le is"+LE);
		 System.out.println("The te is"+TE);
		 

	}

}
