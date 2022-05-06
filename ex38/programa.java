package ex38;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class programa {
	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		
		ArrayList<produto>listaProdutos = new ArrayList<>();
		
		int id;
		String nome;
		double preco;
		double quantidade;
		categoria categoria;
		int opcao;
		int escolha;
		char possuiCategoria;
		
		do {
			System.out.printf("==> Sistema de Cadastro de Produtos <== \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Incluir Produto \n"+
							  "2 - Atualizar Produto \n"+
					 		  "3 - Excluir Produto \n"+
							  "4 - Exibir Produto \n" +
					 		  "5 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				produto produto = new produto();
				
				id = listaProdutos.size()+1;
				produto.setId(id);
				
				System.out.printf("Digite o nome do Produto: ");
				nome = ler.next();
				produto.setNome(nome);
				
				System.out.printf("Digite o preço do Produto: ");
				preco = ler.nextDouble();
				produto.setPreco(preco);
				
				System.out.printf("Digite a quantidade do Produto: ");
				quantidade = ler.nextDouble();
				produto.setQuantidade(quantidade);
				
				System.out.printf("O Produto possui alguma Categoria? (S/N)");
				possuiCategoria = ler.next().charAt(0);
				
				if (possuiCategoria == 'S') {
						categoria produtoCategoria = new categoria();
						
						System.out.printf("Informe o id da Categoria: ");
						id = ler.nextInt();
						produtoCategoria.setId(id);
						
						System.out.printf("Informe o nome da Categoria: ");
						nome = ler.next();
						produtoCategoria.setNome(nome);
						
						categoria = produtoCategoria;
						produto.setCategoria(categoria);
						
				}
				else {
						categoria = null;
						produto.setCategoria(categoria);
				}
				
				listaProdutos.add(produto);
				
				System.out.printf("Produto cadastrado com Sucesso!\n");
				System.in.read();
				
			}
			else if (opcao == 2){
				for(produto produto: listaProdutos) {
					System.out.printf("\nID: %d - Nome: %s - Preço: R$%f - Quantidade: %f\n", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
					
					if (produto.getCategoria() != null) {
						System.out.printf("ID da categoria: %d - Categoria: %s\n", produto.getCategoria().getId(), produto.getCategoria().getNome());			
					}
				}
				
				System.out.printf("\nDigite o id do produto que deseja atualizar: ");
				id = ler.nextInt();
				
				System.out.printf("Digite o novo nome do produto: ");
				nome = ler.next();
				
				System.out.printf("Digite o novo preço do produto: ");
				preco = ler.nextDouble();
				
				System.out.printf("Digite a quantidade atual do produto: ");
				quantidade = ler.nextDouble();
				
				produto produto = listaProdutos.get(id-1);
				
				produto.setId(id);
				produto.setNome(nome);
				produto.setPreco(preco);
				produto.setQuantidade(quantidade);
				
				System.out.printf("Deseja atualizar a Categoria do Produto?\n");
				System.out.printf("1 - Sim\n"+
								  "2 - Não\n");
				escolha = ler.nextInt();
				
				
				if (escolha == 1) {
					System.out.printf("Digite o novo nome da Categoria: ");
					nome = ler.next();
					
					produto.getCategoria().setNome(nome);
				}
				System.out.printf("Produto atualizado com Sucesso!");
				System.in.read();
				
			}
			else if (opcao == 3) {
				for(produto produto: listaProdutos) {
					System.out.printf("\nID: %d - Nome: %s - Preço: R$%d - Quantidade: %d\n", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
					if(produto.getCategoria() != null) {
						System.out.printf("ID da categoria: %d - Categoria: %s", produto.getCategoria().getId(), produto.getCategoria().getNome());			
					}
					
				System.out.printf("\nDigite o id do Produto que deseja excluir: ");
				id = ler.nextInt();
				listaProdutos.remove(id-1);
				
				System.out.printf("Produto excluído com Sucesso!");
				}
				
				System.in.read();
				
			}
			else if (opcao == 4) {
				for(produto produto: listaProdutos) {
					System.out.printf("\nID: %d - Nome: %s - Preço: R$%d - Quantidade: %d\n", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
					if(produto.getCategoria() != null) {
						System.out.printf("ID da categoria: %d - Categoria: %s\n", produto.getCategoria().getId(), produto.getCategoria().getNome());			
					}
				}
				
				System.in.read();
			}
		}
		while(opcao != 5);
		
	ler.close();
	
	}
	
}
