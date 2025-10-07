package listaexercicios;
import java.util.Scanner;
public class Imc {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso em kg:");
		peso = in.nextDouble();
		System.out.println("Digite sua altura em metros:");
		altura = in.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é:" +imc);
		if (imc<18.5) {
			System.out.println("Extrema de Magreza");
		} else if (imc<25) {
			System.out.println("Peso Normal");
		} else if (imc<30) {
			System.out.println("Excesso de Peso");
		} else if (imc<35) {
			System.out.println("Obesidade (Grau 1)");
		} else if (imc<40) {
			System.out.println("Obesidade (Grau 2)");
		} else {
			System.out.println("Obesidade (Grau 3)");
		}
		in.close();
	}

}
