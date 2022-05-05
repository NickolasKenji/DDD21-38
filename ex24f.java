package estrutura_repetição;
import java.util.Scanner;
public class ex24f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, t;
		
		System.out.printf("Digite o número 5: ");
		num = ler.nextInt();
		
		while (num != 5) {
			System.out.printf("Digite o número 5: ");
			num = ler.nextInt();
		}
		
		for(i = 1; i <= 10; i++) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
		}

	}

}
