package listaexercicios;
import java.util.Scanner;
public class OrdenarCrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a, b, c;
		System.out.println("Digite o valor de A:");
		a = in.nextInt();
		System.out.println("Digite o valor de B:");
		b = in.nextInt();
		System.out.println("Digite o valor de C:");
		c = in.nextInt();
		 if (a < b && b < c) {
	            System.out.println("A sequência correta é: " + a + ", " + b + ", " + c);
	     } else if (a<c && c<b) {
	            System.out.println("A sequência correta é: " + a + ", " + c + ", " + b);
	     } else if (b<a && a<c) {
	            System.out.println("A sequência correta é: " + b + ", " + a + ", " + c);
	     } else if (b<c && c<a) {
	            System.out.println("A sequência correta é: " + b + ", " + c + ", " + a);
	     } else if (c<a && a<b) {
	            System.out.println("A sequência correta é: " + c + ", " + a + ", " + b);
	     } else {
	            System.out.println("A sequência correta é: " + c + ", " + b + ", " + a);
	     }
		 in.close();
	}

}
