package Polimorfismo;

import PolimorfismoHeranca.Animal;

public class Cachorro extends Animais implements AnimaisInterface{
	Cachorro(String nomeAnimal, String idadeAnimal, String somAnimal){
		super(nomeAnimal,idadeAnimal,somAnimal);
		nomeClasse = "cachorro";
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