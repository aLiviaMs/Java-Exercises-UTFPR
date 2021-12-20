package exame1;
//ex2
public abstract class Bem {
	double valorVenal;
	
	double calcularImposto() {
		double imposto = 0;
		Veiculo v = new Veiculo(2007);
		Imovel i = new Imovel(500, 0);
		Caminhao c = new Caminhao(207);
		
		if(i.areaConstruida > 0) {
			imposto = i.areaConstruida * 6;
		}
		else if (i.areaConstruida <= 0) {
			imposto = this.valorVenal * (this.valorVenal * 0.05);
		}
		
		
		if(v.anoFabricacao >= 2007) {
			imposto = this.valorVenal + (this.valorVenal * 0.035);
		}
		else if(v.anoFabricacao >= 1996 && v.anoFabricacao<=2006) {
			imposto = this.valorVenal + (this.valorVenal * 0.015);
		}
		else if(v.anoFabricacao < 1996) {
			imposto = 0;
		}
		
		
		if(c.capacidadeCarga >= 15000) {
			imposto = imposto - (imposto * 0.50);
		}
		else if(c.capacidadeCarga < 15000) {
			imposto = imposto - (imposto * 0.30);
		}
		
		return imposto;
	}

}
