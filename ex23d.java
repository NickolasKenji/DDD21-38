package estrutura_repetição;
import java.util.Scanner;
public class ex23d {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int sexo;
		
		do {
			System.out.printf("Digite o seu sexo: 1 para masculino e 2 para feminino: ");
			sexo = ler.nextInt();
		}while (sexo != 1 && sexo != 2);
		
		System.out.printf("Sexo registrado.");

	}

}
