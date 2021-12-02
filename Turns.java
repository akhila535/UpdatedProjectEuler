package Com_Eluer;

import java.util.Scanner;

public class Turns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target");
		int pts=0;
		int trgt=sc.nextInt();
		for(int i=1;i<=trgt;i++)
		{
			System.out.println("Enter turn"+i);
			int t=sc.nextInt();
			pts+=t;
			if(pts>=trgt)
			{
				System.out.println("the scored points"+pts);
				System.out.println("number of turns"+i);
				break;
			}
		}

	}

}
