package Com_Eluer;

import java.util.Scanner;

public class Watermelon {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the watermelon weight");
		wm=sc.nextInt();
		int n=0;
		if(wm%2==0)
		{
			System.out.println("The weight of water melon is even");
			
		}
		else
		{
			for(int a=1;a<wm;a++)
			{
				for(int b=1;b<wm;b++){
					int temp=a+b;
					if(temp==wm)
					{
						n++;
						System.out.println(a+""+b);
					}
				}
					
			}
			System.out.println("possible splitting is"+n);
		}
	}
}
			
			
		
		
			
			
