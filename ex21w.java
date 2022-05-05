package estrutura_repetição;
import java.util.Scanner;
public class ex21w {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		System.out.printf("Digite um número positivo: ");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.printf("Erro, número negativo, digite um número positivo: ");
			num = ler.nextInt();
		}
		
		i = 1;
		
		while (i <= 10) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
			i++;
		}
		
	}

}	
