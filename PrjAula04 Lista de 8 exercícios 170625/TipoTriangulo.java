package listaexercicios;
import java.util.Scanner;
public class TipoTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite o lado A do tri�gulo:");
		a = in.nextDouble();
		System.out.println("Digite o lado B do tri�gulo:");
		b = in.nextDouble();
		System.out.println("Digite o lado C do tri�gulo:");
		c = in.nextDouble();
		if (a>b+c || b>a+c || c>a+b) {
			System.out.println("N�o � tri�gulo");
		} else if (a==b && b==c) {
			System.out.println("Tri�ngulo Equil�tero");
		} else if (a!=b && b!=c && c!=a) {
			System.out.println("Tri�ngulo Escaleno");
		} else {
			System.out.println("Tri�ngulo Is�sceles");
		}
		in.close();
	}

}
