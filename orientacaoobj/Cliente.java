package orientacaoobj;

import java.util.Scanner;

public class Cliente {
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta 
	//classe, em seguida crie um objeto cliente, defina as instancias deste objeto e 
	//apresente as informações deste objeto no console.
	
	Scanner ler = new Scanner (System.in);
	double produto,total;
	
	private String nomeCliente;
	private int codigoCliente;
	public Cliente(String nome, int codigoCliente)
	{
		this.nomeCliente = nome;
		this.codigoCliente = codigoCliente;
	}
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	public double getProduto() {
		return produto;
	}
	public void setProduto(double produto) {
		this.produto = produto;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public double valor(double total)
	{
		System.out.println("\nO valor de cada produto deve ser inserido individulamente. Para finalizar entre com 0 ou com número negativo");
			do
			{
				System.out.println("\nEntre com o valor: ");
				produto = ler.nextDouble();
				total = total + produto;
			}while(produto>0.0);
			return total;
	}
	
	public String getInfo(){
		String info = nomeCliente +"\t\t"+ codigoCliente;
		return info;
	}
	
	public void compra()
	{
		System.out.printf("\nTotal: %.2f",valor(0.0));
	}
}