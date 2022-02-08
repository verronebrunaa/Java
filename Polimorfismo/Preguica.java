package Polimorfismo;

import PolimorfismoHeranca.Animal;

public class Preguica extends Animais implements AnimaisInterface{
	Preguica(String nomeAnimal, String idadeAnimal, String somAnimal){
		super(nomeAnimal,idadeAnimal,somAnimal);
		nomeClasse = "preguica";
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
