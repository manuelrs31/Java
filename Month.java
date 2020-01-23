package com.manu.age;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		byte month;
		char res='s';
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("input a number\n");
			month = in.nextByte();
			switch (month) {
			case 1: System.out.println("january"); break;
			case 2: System.out.println("february"); break;
			case 3: System.out.println("march"); break;
			case 4: System.out.println("april"); break;
			case 5: System.out.println("may"); break;
			case 6: System.out.println("june"); break;
			case 7: System.out.println("july"); break;
			case 8: System.out.println("august"); break;
			case 9: System.out.println("september"); break;
			case 10: System.out.println("october"); break;
			case 11: System.out.println("november"); break;
			case 12: System.out.println("december"); break;
			default: System.out.println("opcion invalida!!");}
			System.out.println("desea introducir otro numero \n  s/n  \n");
			res = in.next().charAt(0);
			while (res!='n' && res!='s')
				{System.out.println("caracter no valido");
			System.out.println("desea introducir otro numero \n  s/n  \n");
			res = in.next().charAt(0);}
			
			if (res=='n')
				System.out.println("See you later!!");
	
		}while(res=='s');

	}

}
