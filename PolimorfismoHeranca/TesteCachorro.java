package PolimorfismoHeranca;

public class TesteCachorro {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ("Noah", 2);
		
		cachorro.cachorroInfo();
		cachorro.getIdadeAnimal();
		cachorro.setSomDoAnimal();
		cachorro.setCorre(true);
		cachorro.imprimirMovimento();
	}
}
