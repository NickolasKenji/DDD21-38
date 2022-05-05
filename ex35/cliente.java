package ex35;

public class cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private conta conta;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public cliente(){
		
	}
	
	public cliente(int id, String nome, int idade, String email, Conta conta){
		this.id=id;
		this.nome=nome;
		this.idade=idade;
		this.email=email;
		this.conta=conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email=novoEmail;
	}
	
	public String exibirNomeIdade(){
		return this.getNome() + " - " + this.getIdade();
	}
	public String exibirDadosConta() {
		if(this.conta!=null)
			return "ag: " + this.conta.getAgencia() + "\nnm:" + this.conta.getNumero();
		else
			return "Não possui conta";
	
}
}
