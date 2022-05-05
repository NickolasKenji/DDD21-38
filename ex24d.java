package estrutura_repetição;
import java.util.Scanner;
public class ex24d {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, t;
		
		do {
			System.out.printf("Digite o número 5: ");
			num = ler.nextInt();
		}while(num != 5);
		
		i = 1;
		
		do {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
			i++;
		}while(i <= 10);

	}

}
