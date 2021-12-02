package Com_Eluer;

import java.util.Scanner;

public class FunFairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r1,r2,r3,r4,r5,r6;
		int sum;
		int amount;
		System.out.println("Enter the amount");
		amount=sc.nextInt();
		r1=amount/100;
		amount=amount%100;
		
		r2=amount/50;
		amount=amount%50;
		
		r3=amount/10;
		amount=amount%10;
		
		r4=amount/5;
		amount=amount%5;
		
		r5=amount/2;
		amount=amount%2;
		
		r6=amount;
		sum=r1+r2+r3+r4+r5+r6;
		System.out.println(sum);
		
		

	}

}
