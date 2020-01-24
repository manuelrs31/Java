package com.manu.age;
import java.util.Scanner;
public class tablas {

	public static void main(String[] args) {
		int num1,num2,num3,res,rep=1;
		Scanner in = new Scanner(System.in);
		
		do
		{
		
		System.out.println(" de que tabla");
		num1=in.nextInt();
		System.out.println(" hasta que tabla");
		num2=in.nextInt();
		System.out.println(" hasta que limite");
		num3=in.nextInt();
		
		if (num2<num1)
			System.out.println("Seas Mamon!!");
		while(num1<=num2)
		{
			for(int i =1; i<=num3; i++)
			{
				res=num1*i;
				System.out.println(num1+" x "+i+" = "+res);
			}
			num1++;
			System.out.println("\t");
		}
		System.out.println(" desea calcular mas tablas \n 1)si 2)no");
		rep=in.nextInt();
		if (rep==2)
			System.out.println(" see you later");


		}while(rep==1);


		

	}

}
