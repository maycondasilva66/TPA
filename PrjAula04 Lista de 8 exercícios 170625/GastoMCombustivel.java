package listaexercicios;
import java.util.Scanner;
public class GastoMCombustivel {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double distancia, capacidadeTanque, gastoMCombustivel;
		System.out.println("Digite a Distância percorrida pelo veículo em km:");
		distancia = in.nextDouble();
		System.out.println("Digite a capacidade do tanque do veículo em litros:");
		capacidadeTanque = in.nextDouble();
		gastoMCombustivel = distancia/capacidadeTanque;
		System.out.println("O seu gasto médio de combustível em km/l é:" +gastoMCombustivel);
		if (gastoMCombustivel>=10) {
			System.out.println("Econômico");
		} else {
			System.out.println("Não econômico");
		}
		in.close();
	}

}
