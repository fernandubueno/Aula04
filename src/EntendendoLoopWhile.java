import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {

		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while(quantidadeAlunos < 5) {
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "º aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos + 1; 
			//quantidadeAlunos +=1;
			//quantidadeAlunos++;
		}
		
		media = media/5.0;
		
		System.out.println("A média das idades é " + media);
		
		leitor.close();

	}

}
