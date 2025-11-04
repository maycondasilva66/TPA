package prjVetor211025;
import java.util.Scanner;
public class MediaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], i;
		double m, s=0;
		a = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor: ");
			a[i] = in.nextInt();
			s = (a[i]+s);
		}
		m = s /TAM;
		System.out.print("A média é : " +m);
		in.close();
	}
}