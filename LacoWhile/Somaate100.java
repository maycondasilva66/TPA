package prjLacoRepeticao;
import java.util.Scanner;
public class Somaate100 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1;
		int soma=0;
		while (i<=100) {
			soma +=i;
			i++;
		}
		System.out.println("A soma dos n�meros de 1 a 100 � igual a: "+soma);
		in.close();
	}

}
