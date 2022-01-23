package sample;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		int r,temp;
		temp=num;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+(r*r*r);
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("number is amstrong number");
		}
		else
		{
			System.out.println("number is not amstrong number");
		}
		

	}

}
