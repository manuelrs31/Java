package com.manu.age;
import java.util.Scanner;
public class Primo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,res=1;
		Scanner in = new Scanner(System.in);
		do {
		System.out.println("introduce un numero");
		num=in.nextInt();
		while(num>1) {
		int num2=num-1;
		while((num%num2)!=0)
		{
			num2--;
		}
		if (num2==1)
			System.out.print(num+" ");
		num--;
		}
		System.out.println(" ");
		System.out.println("desea volver a calcular otro numero 1)si  2)no");
		res=in.nextInt();
		if (res!=1)
			System.out.println("See you later!!");
		
		}while(res!=2);
		

	}

}
