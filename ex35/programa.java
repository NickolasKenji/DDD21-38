package ex35;
import java.util.Scanner;
public class programa {

	public class Programa {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			Cliente[] arrayClientes = new Cliente[5];
			
			char possuiContaBancaria;
			int id;
			String nome;
			int idade;
			String email;
			Conta conta;
			char atualizaEmail;
			String agencia;
			String numero;
			Double saldo;
			
			for(int i=0; i<=4; i++) {
				
				System.out.printf("Informe o id: ");
				id = ler.nextInt();
				
				System.out.printf("Informe o nome: ");
				nome = ler.next();
				
				System.out.printf("Informe a idade: ");
				idade = ler.nextInt();
				
				System.out.printf("Informe o email: ");
				email = ler.next();
				 
				System.out.printf("Possui conta? (S/N)");
				possuiContaBancaria = ler.next().charAt(0);
				
				if (possuiContaBancaria == 'S') {
					Conta contaBancaria = new Conta();
				
					System.out.printf("Informe a agência da conta: ");
					agencia = ler.next();
					contaBancaria.setAgencia(agencia);
					
					System.out.printf("Informe o número da conta: ");
					numero = ler.next();
					contaBancaria.setNumero(numero);
					
					System.out.printf("Informe o saldo da conta: ");
					saldo = ler.nextDouble();
					contaBancaria.setSaldo(saldo);
					
					conta = contaBancaria;
				}
				else {
					conta = null;
				}
				
				Cliente cliente = new Cliente(id, nome, idade, email, conta);
				arrayClientes[i] = cliente;
				
			} for(int i=0; i<=4; i++) {
				System.out.printf("\n%S", arrayClientes[i].exibirNomeIdade());
				System.out.printf("\n%S", arrayClientes[i].exibirDadosConta());
				System.out.printf("\nAtualizar o email? (S/N)");
				
				atualizaEmail = ler.next().charAt(0);
				
				if (atualizaEmail == 'S') {
					System.out.printf("Informe o email: ");
					email = ler.next();
					arrayClientes[i].atualizarEmail(email);
					
					System.out.printf("Email atualizado, novo email: %s",arrayClientes[i].getEmail());
				}
			}
			ler.close();
		}
}

}
