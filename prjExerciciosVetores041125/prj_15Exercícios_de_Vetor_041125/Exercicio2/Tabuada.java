package prjExerciciosVetores;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=5;
		int a[],i;
		a = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+" número: ");
			a[i] = in.nextInt();
		}
		for (i=0;i<TAM;i++) {
			System.out.println("Tabuada do " + a[i] + ":");
			for (int n=1;n<=10;n++) {
				System.out.println(a[i]+" x "+n+" = "+(a[i]*n));
			}
			System.out.println();
		}
		in.close();
	}

}
