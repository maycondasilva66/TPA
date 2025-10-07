package prjLacoRepeticao;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1;
		int idade, maior=0 , menor=0;
		while (i<=5) {
			System.out.println("Digite a idade:");
			idade = in.nextInt();
			if (idade>=18) {
				System.out.println("Maior de idade");
				maior++;
			} else {
				System.out.println("Menor de idade");
				menor++;
			}
			i++;
		}
		System.out.println("Existem "+maior+" maiores de idade:");
		System.out.println("Existem "+menor+" menores de idade:");
		in.close();
	}

}
