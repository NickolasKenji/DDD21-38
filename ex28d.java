package estrutura_repetição;
import java.util.Scanner;
public class ex28d {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, t;
		
		do {
			t = 100 * (100 + 1);
			num = t / 2;
		}while(num != 5050);
		
		System.out.printf("Soma dos números inteiros positivos do intervalo de um a cem: %d", num);

	}

}
