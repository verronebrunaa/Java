package Polimorfismo;

public class Animais {
	
	protected String nomeAnimal;
    protected String idadeAnimal;
    protected String somAnimal;
    protected String nomeClasse;

    public Animais(String n,String i,String s) {
        this.setNomeAnimal(n);
        this.setIdadeAnimal(i);
        this.setSomAnimal(s);
    }

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(String idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public String getSomAnimal() {
		return somAnimal;
	}

	public void setSomAnimal(String somAnimal) {
		this.somAnimal = somAnimal;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
}
