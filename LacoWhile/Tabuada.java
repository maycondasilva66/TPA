package prjLacoRepeticao;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        in.close();
	}

}
