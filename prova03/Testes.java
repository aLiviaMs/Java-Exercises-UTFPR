package prova03;
//ex1
public class Testes {

	public static void main(String[] args) {
		ItemOrcamento itens[] = new ItemOrcamento[3];
		itens[0] = new Produto("Gasolina Aditivada", 5.80, 500);
		itens[1] = new Servico("Jurandir (paisagista)", 30, 27.50);
		itens[2] = new Imposto("INSS sobre pagamentos", 235000.00, 27.50);
		listarOrcamento(itens);
	}

	public static void listarOrcamento(Object[] itens) {
	}
}
