package prjExerciciosVetores;
import java.util.Scanner;
public class VetorBFatorialA {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=15;
		int a[],b[],i,fat,j;
		a = new int[TAM];
		b = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento ");
			a[i] = in.nextInt();
		}
		for (i=0;i<TAM;i++) {
			fat=1;
			for (j=1;j<=a[i];j++) {
				fat=fat*j;
			}
			b[i]=fat;
			System.out.println("O fatorial de "+a[i]+" = "+b[i]);
		}
		in.close();
	}
}