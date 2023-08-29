package Modelo;

public class CarroPasseio extends Veiculo {

	
	private Integer qtdPassageiros;
	
	public String getDados() {
	String dados = " Modelo: " + this.getModelo();
	dados += " - Velocidade: " + this.getVelocidadeMax();
;	dados += " - Quantidade: " + this.getQtdPassageiros();
	dados += " - Cor: " + this.getCor();
	return dados;
			
			
}
	
}
