package PolimorfismoHeranca;

public class Preguica extends Animal{
	private boolean sobearvores;

    public Preguica(String n,int i) {
        super(n,i);
        this.sobearvores = sobearvores;
    }
    public boolean isSobearvores() {
		return sobearvores;
	}
	public void setSobearvores(boolean sobearvores) {
		this.sobearvores = sobearvores;
	}
    public void preguicaInfo() {
        System.out.println("\nA preguiça se chama: "+getNomeAnimal()+". \nA idade dela é: "+getIdadeAnimal()+". \nEla não emite nenhum som!");
    }
    public void imprimirMovimento() {
        if(sobearvores==false) {
            System.out.println("\nEla não sobe em árvores.");
        }
    }
}