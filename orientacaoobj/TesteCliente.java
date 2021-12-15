package orientacaoobj;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Bru Verrone",25);
		System.out.println(cliente1.getInfo());
		cliente1.compra();
	}
}