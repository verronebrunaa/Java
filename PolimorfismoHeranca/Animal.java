package PolimorfismoHeranca;

public class Animal {
	private String nomeAnimal;
	private int idadeAnimal;
	
	public Animal (String n, int i) {
		this.setNomeAnimal(n);
		this.setIdadeAnimal(i);
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	
	public void setSomDoAnimal() {
        System.out.println("\nAuuuuuuu.....Auuuuu.....");
	}
}
