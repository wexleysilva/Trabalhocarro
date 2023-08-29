package Execucao;

import Modelo.Caminhao;
import Modelo.CarroPasseio;
import Modelo.Onibus;

public class VeiculoExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CarroPasseio carro = new CarroPasseio();
	carro.setModelo("Porsche");
	carro.setCor("Hortelã");
	carro.setVelocidadeMax(300);
	carro.setQtdPassageiros(2);
	System.out.println(carro.getDados());
	
	
	Onibus onibus = new Onibus();
	onibus.setCor("Preto");
	onibus.setModelo("Volvo");	
	onibus.setVelocidadeMax(180);
	onibus.setQtdPassageiros(30);
	onibus.setPesoMax(500);
	System.out.println(onibus.getDados());
	
	Caminhao caminhao = new Caminhao();
	caminhao.setModelo("Volkswagen");
	caminhao.setCor("Azul");
	caminhao.setQtdCarga(1000);
	caminhao.setAltura(5);
	caminhao.setVelocidadeMax(120);
	System.out.println(caminhao.getDados());
	
	
	
	
	
	}

}
