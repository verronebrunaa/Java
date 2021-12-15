package Arrays;

import java.util.Scanner;

public class Exercicio3_Arrays {

	public static void main(String[] args) {
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		try (Scanner entrada = new Scanner(System.in)) {
			int[][] matriz = new int [3][3];
			int maior10 = 0;
			
				System.out.println ("Matriz M[3][3]\n");
				// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
				
				for(int linha = 0; linha < 3 ; linha ++) {
					for(int coluna = 0 ; coluna < 3 ; coluna++) {
						System.out.printf("Insira o valor M[%d][%d]:",linha+1,coluna+1);
						matriz[linha][coluna]= entrada.nextInt();
						
						if(matriz[linha][coluna] > 10)
						{
							maior10 ++;
							}
						}
					}			
				System.out.printf("\nForam digitados %d vezes um valor maior que 10.",maior10);
				}
	}

}
