package Collections;

	import java.util.ArrayList;
	import java.util.Collection;

	public class Estoque {
	    public static void main(String[] args) {
	        Collection<String> Livraria = new ArrayList();

	        Livraria.add("Romance");
	        Livraria.add("Biografia");
	        Livraria.add("Fantasia");
	        Livraria.add("Idiomas");
	        Livraria.add("Suspense");

	        for(String produto : Livraria) {
	            System.out.println("Possui os livros de gênero: "+produto);
	        }

	        System.out.println("\nContém o livro de Romance? "+Livraria.contains("Romance"));
	        System.out.println("\nProdutos: "+Livraria);
	        System.out.println("\nEstoque de livros: "+Livraria);
	        Livraria.remove("Idiomas");
	        System.out.println("Atualização do estoque de livros: "+Livraria);
	    }
	}
