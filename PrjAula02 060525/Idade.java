package prjAula02;
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		//criando um scanner chamado ler
		Scanner ler = new Scanner(System.in);
		
		int anoNascimento, anoAtual, idade;
		
		System.out.println("Entre com o seu ano de nascimento:");
		anoNascimento = ler.nextInt();
		
		System.out.println("Entre com o ano atual:");
		anoAtual = ler.nextInt();
		
		idade = anoAtual-anoNascimento;
		System.out.println("Sua idade é:"+ idade);
		ler.close();
				
	}

}
