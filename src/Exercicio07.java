import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		int qntFeijoes = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while(qntFeijoes != 1238) {
			System.out.println("Informe a quantidade de feij�es do jarro.");
			qntFeijoes = leitor.nextInt();

		}
			System.out.println("Parab�ns! O jarro tinha exatamente 1238 feij�es!");
		leitor.close();

	}

}
