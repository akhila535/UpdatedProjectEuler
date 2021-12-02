package Com_Eluer;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1,p2,p3,total,lessprice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product 1");
		p1=sc.nextInt();
		System.out.println("Enter the product 2");
		p2=sc.nextInt();
		System.out.println("Enter the product 3");
		p3=sc.nextInt();
		total=p1+p2+p3;
		System.out.println("The total product is"+total);
		int dis=20;
		int p=100-dis;
		float payoffer1=(p*total)/100;
		System.out.println("The pay offer 1 price is"+payoffer1);
		if(p1<p2 && p2<p3)
		{
		  lessprice=p1;	
		}
		else if(p2<p1 && p2<p3)
		{
			lessprice=p2;
		}
		else
		{
			lessprice=p3;
		}
		System.out.println((total-lessprice));
		
		

	}

}
