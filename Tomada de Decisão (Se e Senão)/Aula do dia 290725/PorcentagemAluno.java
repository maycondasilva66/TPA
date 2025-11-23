package listaComplementar2;
import java.util.Scanner;
public class PorcentagemAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int  maior, menor, idade1, idade2, idade3, idade4, idade5, porcentagemMaior, porcentagemMenor;
		maior = 0;
		menor = 0;
		System.out.println("Digite a primeira idade:");
		idade1 = in.nextInt();
		System.out.println("Digite a segunda idade:");
		idade2 = in.nextInt();
		System.out.println("Digite a terceira idade:");
		idade3 = in.nextInt();
		System.out.println("Digite a quarta idade:");
		idade4 = in.nextInt();
		System.out.println("Digite a quinta idade:");
		idade5 = in.nextInt();
		if (idade1>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		if (idade2>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		if (idade3>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		if (idade4>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		if (idade5>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		porcentagemMaior = (maior*100) /5;
		porcentagemMenor = (menor*100) /5;
		System.out.println("Porcentagem de alunos maiores de idade: " + porcentagemMaior + "%");
		System.out.println("Porcentagem de alunos menores de idade: " + porcentagemMenor + "%");

		in.close();
	}

}
