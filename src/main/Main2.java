package main;

import aplicacao.Contrato;
import imovel.Imovel;
import proprietario.Proprietario;

public class Main2 {
	public static void main(String[] args) {
		
		Proprietario[] p1 = {
				new Proprietario("Joao Bongas", 28),
				new Proprietario ("Maria Bongas", 24)
		};
		
		Imovel I1 = new Imovel(259, 35000, p1);
		
		Proprietario[] p2 = {
				new Proprietario("Guilherme", 33),
				new Proprietario("Lucilda", 29),
				new Proprietario("Clotisforme IV", 253)
		};
		
		Imovel I2 = new Imovel(334, 28000, p2);
		
		Contrato[] contratos = {
				new Contrato(25,2003, I1),
				new Contrato(47,I2)
		};
		
		for(Contrato c: contratos) {
			c.printContrato();
			System.out.printf("\n");
		}
	}
}
