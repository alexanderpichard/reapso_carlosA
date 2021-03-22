package repaso_carlos.mario;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		System.out.println("este es un metodo de suma");
		sumar();
		
	}

	public static void sumar() {
		Scanner ent=new Scanner(System.in);
		int num1=0 , num2=0;
		
		System.out.println("Introduce el primer numero");
		num1=ent.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=ent.nextInt();
		int total= num1+num2;
		System.out.println(num1 +"+"+num2+"="+total);
	}
}
