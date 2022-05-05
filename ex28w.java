package estrutura_repetição;
import java.util.Scanner;
public class ex28w {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, t;
		t = 100 * (100 + 1);
		num = t / 2;
		
		System.out.printf("Soma dos números inteiros positivos do intervalo de um a cem.");
		
		while(num != 5050) {
			System.out.printf("Erro");
		}
		
		System.out.printf("\nA soma é de: %d", num);

	}

}
