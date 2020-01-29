package com.manu.age;
import java.util.Scanner;
public class primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean isPrime=true;
		int num=0,res=1;
		do {
		System.out.println("introduce que numero deseas saber si es primo o no");
		num=in.nextInt();
		int num2=num-1;
		
		//num=in.nextInt();
		
		
		while((num%num2) !=0)
		{
			num2--;
		}
		if (num2==1)
			System.out.println(isPrime);
		else
			System.out.println(isPrime=false);
		System.out.println("deseas conocer otro numero  1)si  2)no ");
		res=in.nextInt();
		if(res!=1)
			System.out.println("See you later!!");
		}while(res!=2);

	}

}
