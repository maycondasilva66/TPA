package listaexercicios;
import java.util.Scanner;
public class GastoMCombustivel {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double distancia, capacidadeTanque, gastoMCombustivel;
		System.out.println("Digite a Dist�ncia percorrida pelo ve�culo em km:");
		distancia = in.nextDouble();
		System.out.println("Digite a capacidade do tanque do ve�culo em litros:");
		capacidadeTanque = in.nextDouble();
		gastoMCombustivel = distancia/capacidadeTanque;
		System.out.println("O seu gasto m�dio de combust�vel em km/l �:" +gastoMCombustivel);
		if (gastoMCombustivel>=10) {
			System.out.println("Econ�mico");
		} else {
			System.out.println("N�o econ�mico");
		}
		in.close();
	}

}
