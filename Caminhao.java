package Modelo;

public class Caminhao extends Veiculo{
	
private Integer altura;
private Integer qtdCarga;


public String getDados() {
String dados = " Modelo: " + this.getModelo();
dados += " - Velocidade: " + this.getVelocidadeMax();
dados += " - Cor: " + this.getCor();
dados += " - Quantidade: " + this.getQtdCarga();
dados += " - Altura: " + this.getAltura();

return dados;
}

public Integer getAltura() {
	return altura;
}
public void setAltura(Integer altura) {
	this.altura = altura;
}
public Integer getQtdCarga() {
	return qtdCarga;
}
public void setQtdCarga(Integer qtdCarga) {
	this.qtdCarga = qtdCarga;
}


}
