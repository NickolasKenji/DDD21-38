package ex34;

public class cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public contabancaria conta;
	
	
	cliente(){
		
	}
	
	cliente(int id, String nome, int idade, String email, ContaBancaria conta){
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
		return this.nome + " - " + this.idade;
	}
	public String exibirDadosConta() {
		if(this.conta!=null)
			return "AG: " + this.conta.agencia + "\nNum:" + this.conta.numero;
		else
			return "Não tem conta";
	
}
}
