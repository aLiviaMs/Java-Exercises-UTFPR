package exame1;
//ex1
public class CriacaoCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro("Fiat", "Uno", 13.5, 40);
		
		c1.abastecer(45);
		c1.mostrarDados();
		
		c1.andar(5);
		c1.mostrarDados();
		
		c1.andar(15);
		c1.mostrarDados();
		
		c1.abastecer(2);
		c1.mostrarDados();
		
		c1.abastecer(100);
		c1.andar(40);
		c1.mostrarDados();
	}

}
