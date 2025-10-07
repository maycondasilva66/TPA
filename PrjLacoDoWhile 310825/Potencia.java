package prjLacoFacaEnquanto;
import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1,base,exp;
		int potencia=1;
		System.out.println("Digite a base:");
		base = in.nextInt();
		System.out.println("Digite o expoente:");
		exp = in.nextInt();
		do {
			potencia = potencia*base;
			i++;
		}while (i<=exp);
		System.out.println("O resultado da potência é: "+potencia);
		in.close();
	}
}