package prjVetor211025;
import java.util.Scanner;
public class PosicaoQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],b[],c[],i;
		a = new int[TAM];
		b = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o número: ");
			a[i] = in.nextInt();
			b[i] = a[i]*a[i];
		}
		for (i=0;i<TAM;i++) {
			System.out.print(b[i]+ " ");
		}	
		in.close();
	}
}