package com.manu.age;

import java.util.Scanner;

public class Age {
//  this example is about the age of the user 
	public static void main(String[] args) {
		 byte age;
		 byte res=1;
		 do
		 {
			 
			 System.out.println("input your age");
			 Scanner in = new Scanner(System.in);
			 age = in.nextByte();
			 
			 if(age<=0)
				 System.out.println("seas Mamon prro!! ");
			 
			 else if(age<18)
				 System.out.println("you are a baby");
			 else if(age>=18 && age<30)
				 System.out.println("you are a chavorruco");
			 else if(age>30 && age<38)
				 System.out.println("you are a Ruco");
			 else if (age == 38)
				 System.out.println("you are a Superman!!");
			 else if (age>38)
				 System.out.println("you are a granfather");
			 System.out.println("deseas volver a introducir una edad?\n 1) si 2) no"	);
			 res = in.nextByte();
			 while(res!= 1 && res !=2)
			 { System.out.println("respuesta invalida\n");
			 System.out.println("deseas volver a introducir una edad?\n 1) si 2) no"	);
			 res = in.nextByte();}
			 if (res == 2)
				 System.out.println("see you later!!");
			 }while(res==1);

	}

}
