package LacosdeDecisao;

import java.util.Scanner;

public class Exercicio2LacoDec {

	public static void main(String[] args) {
		//* Faça um programa que entre com trê números e coloque em ordem crescente. */
		
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();	
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("Ordem crescente: "+a+", "+b+" e "+c);
		}
		else if(1<=c && c<=b)
		{
			System.out.println("Ordem crescente: "+a+", "+c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("Ordem crescente: "+b+", "+a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("Ordem crescente: "+b+", "+c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("Ordem crescente: "+c+", "+a+" e "+b);
		}
		else
		{
			System.out.println("Ordem crescente: "+c+", "+b+" e "+a);
		}
	}

}
