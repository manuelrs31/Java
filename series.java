package com.manu.age;

public class series {

	public static void main(String[] args) {
		// serie del 1 - 10
		for(int i=1; i<=10; i++)
			System.out.print(i+" ");
		System.out.print("\n ");	
		// serie 1-100
		for(int i=1; i<=100; i++)
			System.out.print(i+" ");
		System.out.print("\n ");	

		//serie del 1-1000
		for(int i=1; i<=1000; i++)
			System.out.print(i+" ");
		System.out.print("\n ");	

		// serie del 100-1
		for(int i=100; i>=1; i--)
			System.out.print(i+" ");
		System.out.print("\n ");	

		//serie del 0 al 300 de 3 en 3
		for(int i=0; i<=300; )
			{System.out.print(i+" ");
			i+=3;}
		System.out.print("\n ");	

		// serie del 300 al 0 de 3 en 3 
		for(int i=300; i>=0; )
		{System.out.print(i+" ");
		i-=3;}

	}

}
