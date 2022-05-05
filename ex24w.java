package estrutura_repetição;
import java.util.Scanner;
public class ex24w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, t;
		
		System.out.printf("Digite o número 5: ");
		num = ler.nextInt();
		
		while(num != 5) {
			System.out.printf("Digite o número 5: ");
			num = ler.nextInt();
		}
		
		i = 1;
		
		while(i <= 10) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
			i++;
		}

	}

}
