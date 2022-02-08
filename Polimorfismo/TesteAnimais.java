package Polimorfismo;

public class TesteAnimais {
	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro("Bart","5 anos","Au au");
		Cavalo cavalo = new Cavalo("Luna","3 anos","Relincho");
        Preguica preguica = new Preguica("Orfeu","9 anos","Sem som");

        System.out.println("\nO animal é: "+cachorro.getNomeClasse()+"\nO nome é: "+cachorro.getNomeAnimal()+"\nA idade do cachorro é: "+cachorro.getIdadeAnimal()+". \nO som do animal é: "+cachorro.getSomAnimal());
        System.out.println("\nO animal é: "+cavalo.getNomeClasse()+"\nO nome é: "+cavalo.getNomeAnimal()+"\nA idade do cavalo é: "+cavalo.getIdadeAnimal()+". \nO som do animal é: "+cavalo.getSomAnimal());
        System.out.println("\nO animal é: "+preguica.getNomeClasse()+"\nO nome é: "+preguica.getNomeAnimal()+"\nA idade da preguiça é: "+preguica.getIdadeAnimal()+". \nO som do animal é: "+preguica.getSomAnimal());	
	}

}
