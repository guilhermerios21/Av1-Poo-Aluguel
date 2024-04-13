package imovel;
import proprietario.Proprietario;

public class Imovel {
	private int numero;
	float  preco;
	private Proprietario[] proprietario;
	
	public Imovel(int numero, float preco, Proprietario[] proprietario) {
		setNumero(numero);
		setPreco(preco);
		this.proprietario = proprietario;
	}
	
	private void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public Proprietario[] getProprietario(){
		return this.proprietario;
	}
}
