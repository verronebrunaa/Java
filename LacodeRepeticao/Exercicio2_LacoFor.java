package LacodeRepeticao;

import java.util.Scanner;

public class Exercicio2_LacoFor {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		int x;
		int valorPar = 0,valorImpar = 0,contador;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<=10;x++) {
			System.out.printf("\nNúmero "+x);
									
			for(contador =0; contador <=0; contador++)
			{				
				if(x % 2 == 0)
				{
					valorPar ++ ;
				}
				else
				{
					valorImpar ++ ;
				}
			}
			System.out.printf("\nNessa sequência tem %d numero(s) ìmpar(es). ",valorImpar);
			System.out.printf("\nNessa sequência tem %d numero(s) par(es).",valorPar);
			}	
		}
	}
