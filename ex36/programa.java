package ex36;
import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		produto[] listaProdutos = new Produto[5];
		
		char possuiCategoria;
		int id;
		String nome;
		double quantidade;
		double preco;
		categoria categoria;
		
		for(int i=0; i<=4; i++) {
			produto produto = new produto();
			
			System.out.printf("Informe o id do Produto: ");
			id = ler.nextInt();
			produto.setId(id);
			
			System.out.printf("Informe o nome do Produto: ");
			nome = ler.next();
			produto.setNome(nome);
			
			System.out.printf("Informe o preço do Produto: ");
			preco = ler.nextDouble();
			produto.setPreco(preco);
			
			System.out.printf("Informe a quantidade de Produtos: ");
			quantidade = ler.nextDouble();
			produto.setQuantidade(quantidade);
			
			System.out.printf("O produto possui alguma categoria? Responda S para Sim e N para Não.");
			possuiCategoria = ler.next().charAt(0);
			
			if (possuiCategoria == 'S'){
					categoria categoriaProduto = new categoria();
					
					System.out.printf("Informe o id da Categoria: ");
					id = ler.nextInt();
					categoriaProduto.setId(id);
					
					System.out.printf("Informe o nome da Categoria: ");
					categoriaProduto.setNome(nome);
					categoria = categoriaProduto;
					
			}
			else {
					categoria=null;
			}
			
			produto p2 = new produto(id, nome, preco, quantidade, categoria);
			listaProdutos[i] = p2;
		}
		for(int i=0; i<=4; i++) {
			System.out.printf("\n%S", listaProdutos[i].exibirNomePreco());
			System.out.printf("\n%S", listaProdutos[i].exibirNomeQuantidade());
		}
		
		ler.close();
	}

}
