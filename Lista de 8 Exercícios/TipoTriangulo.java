package listaexercicios;
import java.util.Scanner;
public class TipoTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite o lado A do triâgulo:");
		a = in.nextDouble();
		System.out.println("Digite o lado B do triâgulo:");
		b = in.nextDouble();
		System.out.println("Digite o lado C do triâgulo:");
		c = in.nextDouble();
		if (a>b+c || b>a+c || c>a+b) {
			System.out.println("Não é triâgulo");
		} else if (a==b && b==c) {
			System.out.println("Triângulo Equilátero");
		} else if (a!=b && b!=c && c!=a) {
			System.out.println("Triângulo Escaleno");
		} else {
			System.out.println("Triângulo Isósceles");
		}
		in.close();
	}

}
