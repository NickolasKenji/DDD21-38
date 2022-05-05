package estrutura_repetição;
import java.util.Scanner;
public class ex31f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		int i = 0;
		int a = 1;
		int b = 0;
		int aux;
		
		System.out.printf("Digite até qual casa você gostaria de saber da sequência: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.printf("Digite até qual casa você gostaria de saber da sequência: ");
			num = ler.nextInt();
		}
		
		for(i = 0; i<= num; i++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}

	}

}
