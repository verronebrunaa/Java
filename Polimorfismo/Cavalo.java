package Polimorfismo;

import PolimorfismoHeranca.Animal;

public class Cavalo extends Animais implements AnimaisInterface{
	Cavalo(String nomeAnimal, String idadeAnimal, String somAnimal){
			super(nomeAnimal,idadeAnimal,somAnimal);
			nomeClasse = "cavalo";
		}
	@Override
    public String getNomeAnimal(){
        return nomeAnimal;
    }
    public String getIdadeDoAnimal() {
        return idadeAnimal;
    }
    public String getSomDoAnimal() {
        return somAnimal;
    }
}
