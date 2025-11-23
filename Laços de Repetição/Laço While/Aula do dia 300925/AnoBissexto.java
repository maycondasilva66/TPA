package prjExercicioLaco;
import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int anoInicial,anoFinal,i=1;
		System.out.println("Digite o ano inicial");
		anoInicial = in.nextInt();
		System.out.println("Digite o ano final");
		anoFinal = in.nextInt();
		
		System.out.println("Anos Bissextos:");
		while (anoInicial<=anoFinal) {
			if (anoInicial%4==0) {
				System.out.println(anoInicial);
				i++;
			}
			anoInicial=anoInicial+1;
		}
		System.out.print("A quantidade de anos bissextos é de: "+i);
		in.close();
	}
}