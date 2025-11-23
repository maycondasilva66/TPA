package prjExercicioLaco;
import java.util.Scanner;
public class IdadeUsuario {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int anoAtual,anoNascimento,idade,i;
		do {
			System.out.println("Digite o ano atual");
			anoAtual = in.nextInt();
			System.out.println("Digite o ano de nascimento");
			anoNascimento = in.nextInt();
			idade= anoAtual-anoNascimento;
			
			System.out.println("Sua idade é: "+idade);
			System.out.println("Deseja continuar? 1-Sim  2-Não");
			i = in.nextInt();
		}while (i==1);
		System.out.println("Fim do programa");
		in.close();
	}
}