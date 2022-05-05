package estrutura_repetição;
import java.util.Scanner;
public class ex30w {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, i;
		int a = 1;
		int b = 0;
		int aux;
		
		System.out.printf("Digite até qual casa você gostaria de saber na sequência de Fibonacci: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.printf("Digite até qual casa você gostaria de saber na sequência de Fibonacci: ");
			num = ler.nextInt();
		}
		
		i = 0;
		
		while(i <= num) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
			i++;
		}

	}

}
