package Modelo;

public class Onibus extends Veiculo {

	private Integer qtdPassageiros;
	private Integer pesoMax;	
	
	
	
	public String getDados() {
	String dados = " Modelo: " + this.getModelo();
	dados += " - Velocidade: " + this.getVelocidadeMax();
;	dados += "- Quantidade: " + this.getQtdPassageiros();
	dados += " - Cor: " + this.getCor();
	dados += " - Peso Máximo: " + this.getPesoMax();
	return dados;
	}
	
	
	

	public Integer getQtdPassageiros() {
		return qtdPassageiros;
	}




	public void setQtdPassageiros(Integer qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}




	public Integer getPesoMax() {
		return pesoMax;
	}




	public void setPesoMax(Integer pesoMax) {
		this.pesoMax = pesoMax;
	}




	




	
	
}

	



