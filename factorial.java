package com.manu.age;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int res=1,fac;
		Scanner in = new Scanner(System.in);
		System.out.println(" hasta que numero quieres generar el factorial ?");
		fac=in.nextInt();
		for(int i=1; fac>=i; fac--)
			res*=fac;
		System.out.println(res);
	}

}
