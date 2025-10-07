package prjListaComplementar;
import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso");
		peso = in.nextDouble();
		System.out.println("Digite sua altura");
		altura = in.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é:" +imc);
		in.close();
		
	}

}
