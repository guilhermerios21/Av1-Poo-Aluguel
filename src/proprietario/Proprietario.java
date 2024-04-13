package proprietario;

public class Proprietario {
	private int idade;
	private String nome;
	
	public Proprietario(String nome, int idade) {
		setNomeProp(nome);
		setIdadeProp(idade);
	}
	
	private void setNomeProp(String nome) {
		this.nome = nome;
	}
	
	public String getNomeProp() {
		return this.nome;
	}
	
	private void setIdadeProp(int idade) {
		this.idade= idade;
	}
	
	public int getIdadeProp() {
		return this.idade;
	}

}
