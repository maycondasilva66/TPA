package prjLacoFacaEnquanto;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=2,n;
		int anterior=0, atual=1, sucessor;
		System.out.println("Digite o número de termos:");
		n = in.nextInt();
		System.out.print(atual+ " ");
		do {
			sucessor = anterior+atual;
			System.out.print(sucessor+ " ");
			anterior=atual;
			atual=sucessor;
			i++;
		}while (i<=n);
		in.close();
	}
}