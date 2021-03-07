import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		int qntFeijoes = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while(qntFeijoes != 1238) {
			System.out.println("Informe a quantidade de feijões do jarro.");
			qntFeijoes = leitor.nextInt();

		}
			System.out.println("Parabéns! O jarro tinha exatamente 1238 feijões!");
		leitor.close();

	}

}
