package prjExerciciosVetores;
import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=20;
		int a[],b[],i;
		a = new int[TAM];
		b = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento ");
			a[i] = in.nextInt();
		}
		System.out.print("Pares: ");
		for (i=0;i<TAM;i++) {
			if (a[i]%2==0) {
				b[i] = a[i];
				System.out.print(b[i] +" ");
			}
		}
		System.out.println();
		System.out.print("Ímpares: ");
		for (i=0;i<TAM;i++) {
			if (a[i]%2!=0) {
				b[i] = a[i];
			System.out.print(b[i] +" ");
			}
		}
		in.close();
	}
}