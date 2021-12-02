package Com_Eluer;

import java.util.Scanner;

public class Chocolates {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cho,chld;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of choclates");
		cho=sc.nextInt();
		System.out.println("Enter the number of childern");
		chld=sc.nextInt();
        int n=0;
		for(int i = 1;i<=chld;i++)
        {
           if(cho>=i)
           {
        	 cho=cho-i;
        	 n++;
           }
        }
		System.out.println("The remaining choclates"+cho);
		System.out.println("childerns who got choclates"+n);
	}

}
