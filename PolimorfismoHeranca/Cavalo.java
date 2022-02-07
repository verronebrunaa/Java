package PolimorfismoHeranca;

public class Cavalo extends Animal{
	private boolean corre;

    public Cavalo(String n,int i) {
        super(n,i);
        this.corre = corre;
    }
    public boolean isCorre() {
        return corre;
    }
    public void setCorre(boolean corre) {
        this.corre = corre;
    }
    public void setSomAnimal() {
        System.out.println("\nPocotó, pocotó, pocotó");
    }
    public void cavaloInfo() {
        System.out.println("\nO cavalo se chama: "+getNomeAnimal()+". \nA idade dele é: "+getIdadeAnimal()+". \nO som dele é: ");
    }
    public void imprirmirMovimento() {
        if(corre==true) {
            System.out.println("\nEsse cavalo corre muito.");
        }
    }
}