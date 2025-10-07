package prjListaComplementar;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double salarioLiquido, salarioBruto;
		System.out.println("Digite o seu salário bruto");
		salarioBruto = in .nextDouble();
		salarioLiquido = (8/100*salarioBruto) + (6/100*salarioBruto);
		System.out.println("Seu salário líquido é:" +salarioLiquido);
		in.close();
	}

}
