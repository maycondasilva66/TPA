package listaexercicios;
import java.util.Scanner;
public class EquacaoSegundoGrau {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double a,b,c,delta,x1,x2;
		System.out.println ("Digite o a da equa��o");
		a = in.nextDouble();
		System.out.println("Digite o b da equa��o");
		b = in.nextDouble();
		System.out.println("Digite o c da equa��o");
		c = in.nextDouble();
		delta = (b*b) -4*a*c;
		if (delta<0) {
			System.out.println("N�o tem raiz");
		} else if (delta == 0) {
			x1 = (-b + Math.sqrt (delta) /2*a);
			System.out.println("S� tem uma raiz" +x1);
		} else {
			x1 = (-b + Math.sqrt (delta) /2*a);
			x2 = (-b - Math.sqrt (delta) /2*a);
			System.out.println("Existem duas ra�zes: " + x1 +" e "+ x2);
		}
		in.close();
	}

}
