package com.manu.age;
import java.util.Scanner;
public class fibonaci {

	public static void main(String[] args) {
		int cont1=1,cont2=0,num1,fib=0;
		Scanner in = new Scanner(System.in);
		System.out.println(" hasta que numero quieres generar la serie ?");
		num1=in.nextInt();
		for(int i=1; i<=num1/2; i++)
		{
			cont1+=cont2;
			fib=cont1;
			System.out.print(fib+" ");
			cont2+=cont1;
			fib=cont2;
			System.out.print(fib+" ");
			//cont1=cont2;


		}


	}

}
