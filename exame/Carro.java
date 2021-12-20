package exame1;
//ex1
public class Carro {
	String marca;
	String modelo;
	double kmRodado = 0;
	double kmPorLitro;
	float capacidadeTanque;
	float litrosTanque = 0;
	
	public Carro(String marca, String modelo, double kmPorLitro, float capacidadeTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.kmPorLitro = kmPorLitro;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	void mostrarDados() {		
		System.out.println("Km Rodado: " + this.kmRodado + " Litros Tanque: " + this.litrosTanque + " Carro: " + this.marca + " Modelo: " + this.modelo);
	}
	
	double abastecer(double litros) {
		if (litros > this.capacidadeTanque) {
			litros = this.capacidadeTanque;
		}
		this.litrosTanque = (float) litros;
		
		return this.litrosTanque;
	}
	
	double andar(double kms) {
		if(litrosTanque >= kms) {
			this.litrosTanque = (float) (this.litrosTanque - kms);
			this.kmRodado = this.kmRodado + kms;
		} 
		
		return this.kmRodado;
	}

}
