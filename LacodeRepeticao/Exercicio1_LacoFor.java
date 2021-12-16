package LacodeRepeticao;

public class Exercicio1_LacoFor {

	private static double divisaoExata;

	public static void main(String[] args) {
		/*Informar todos os números de 1000 a 1999
		 * que quando divididos por 11 obtemos resto = 5. (FOR) */

		int x;
		int divisao;
		
		for(x=1000;x<=1999;x++)
		{
			System.out.printf("");
				if(x>=1000 && x<=1999) {
					if(x%11==5) {
						divisao=x;
						System.out.printf("\nValores divisiveis por 11 e resta 5, são: "+divisao);
					}
				}
		}
	}
	
}
