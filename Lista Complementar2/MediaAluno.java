package listaComplementar2;
import java.util.Scanner;
public class MediaAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double n1, n2, n3, n4, mi, ex, nm;
		System.out.println("Digite a primera nota");
		n1 = in.nextDouble();
		System.out.println("Digite a segunda nota");
		n2 = in.nextDouble();
		System.out.println("Digite a terceira nota");
		n3 = in.nextDouble();
		System.out.println("Digite a quarta nota");
		n4 = in.nextDouble();
		mi = (n1+n2+n3+n4) /4;
		System.out.println("Sua média é:" +mi);
		if (mi>7) {
			System.out.println("Aprovado");
		} else if (mi<5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Exame");
			System.out.println("Digite a nota do exame:");
			ex = in.nextDouble();
			nm = (mi+ex) /2;
			System.out.println("Sua nova média é:");
			if (nm>=7) {
				System.out.println("Aprovado no exame");
			} else {
				System.out.println("Reprovado no exame");
			}
		}
		in.close();
	}

}
