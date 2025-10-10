package listaexercicios;
import java.util.Scanner;
public class DescontoIrpf {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double salario, desconto;
		System.out.println("Digite seu salário:");
		salario = in.nextDouble();
		if (salario<=1434.59) {
			System.out.println("Desconto de R$0");
		} else if (salario<=2150.00) {
			desconto = (salario*7.5/100)-107.59;
			System.out.println("Desconto de R$" +desconto);
		} else if (salario<=2866.70) {
			desconto = (salario*15/100)-268.64;
			System.out.println("Desconto de R$" +desconto);
		} else if (salario<=3582.00) {
			desconto = (salario*22.5/100)-483.84;
			System.out.println("Desconto de R$" +desconto);
		} else {
			desconto = (salario*27.5/100)-662.94;
			System.out.println("Desconto de R$" +desconto);
		}
		in.close();
	}

}
