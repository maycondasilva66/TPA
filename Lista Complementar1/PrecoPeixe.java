package prjListaComplementar;
import java.util.Scanner;
public class PrecoPeixe {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double peso, custo;
		System.out.println("Digite o peso do peixe:");
		peso = in.nextDouble();
		if (peso<=3) {
			System.out.println("O peixe custará: R$12.00");
		} else if (peso<=5) {
			System.out.println("O peixe custará: R$14.00");
		} else if (peso<=10) {
			System.out.println("O peixe custará: R$15.00");
		} else {
			custo = (17+8);
			System.out.println("O peixe custará: R$25.00" +custo);
		}
		in.close();
	}
}
