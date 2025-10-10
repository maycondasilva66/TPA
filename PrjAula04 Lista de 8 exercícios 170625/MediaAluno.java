package listaexercicios;
import java.util.Scanner;
public class MediaAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double nota1, nota2, media, nota3, novaMedia;
		System.out.println("Digite a primeira nota:");
		nota1 = in.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = in.nextDouble();
		media = (nota1+nota2) /2;
		System.out.println("Sua média é: " +media);
		if (media<3) {
			System.out.println("Reprovado");
		} else if (media>=6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Exame");
		
		System.out.println("Digite a nota do exame:");
		nota3 = in.nextDouble();
		novaMedia = (media+nota3) /2;
		System.out.println("Sua nova média é: " +novaMedia);
		if (novaMedia>=6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		}
		in.close();
	}

}
