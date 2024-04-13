package aplicacao;

import imovel.Imovel;
import proprietario.Proprietario;

public class Contrato {
	private int numeroContrato, anoContrato;
	private double corretagem;
	private Imovel imovel;

	public Contrato(int numeroContrato, int anoContrato, Imovel imovel) {
		this.imovel = imovel;
		setNumeroContrato(numeroContrato);
		setCorretagem(anoContrato);
	}
	
	public Contrato(int numeroContrato, Imovel imovel) {
		int ano = 2020;
		this.imovel = imovel;
		setNumeroContrato(numeroContrato);
		setCorretagem(ano);
	}
	
	private void setNumeroContrato(int numeroContrato) {
		this.numeroContrato= numeroContrato;
	}
	
	public int getNumeroContrato() {
		return this.numeroContrato;
	}
	
	private void setCorretagem(int anoContrato) {
		this.anoContrato = anoContrato;
		if(anoContrato >= 2020 || this.imovel.getPreco() > 1000000) {
			this.corretagem = this.imovel.getPreco() * 0.05;
		}
		else {
			this.corretagem = this.imovel.getPreco() * 0.01;
		}
	}
	
	
	public void printContrato() {
		System.out.println("Numero do contrato: "+ this.numeroContrato);
		System.out.println("ano do contrato: " + this.anoContrato);
		System.out.println("preco do imovel: "+ this.imovel.getPreco());
		System.out.println("valor da corretagem : " + this.corretagem);
		for(Proprietario a:imovel.getProprietario()) {
			System.out.println("nome: " + a.getNomeProp());
			System.out.println("idade: " + a.getIdadeProp());
		}
		
	}
}
