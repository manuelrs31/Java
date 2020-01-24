package com.manu.age;

import java.util.Scanner;

public class serie_incremento {

	public static void main(String[] args) {
		int num1,num2,inc,dec;
		Scanner in = new Scanner(System.in);
		// serie con incremento
		System.out.println("dame el numero inicial de la serie!");
		num1=in.nextInt();
		System.out.println("dame el numero final de la serie!");
		num2=in.nextInt();
		System.out.println("dame el incremento o decremento de la serie!");
		inc=in.nextInt();
		if (num1<num2)
		{
			
			while(num1<=num2)
			{
				System.out.print(num1+" ");
				num1+=inc;
			}
				
		}
		else
		{
			while(num1>=num2)
			{System.out.print(num1+" ");
			num1-=inc;}
		}
			



	}

}
