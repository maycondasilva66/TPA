package prjExerciciosVetores;
import java.util.Scanner;
public class RelacaoParesVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],i,par=0;
		a = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento ");
			a[i] = in.nextInt();
		}
		for (i=0;i<TAM;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		for (i=0;i<TAM;i++) {
			if (a[i]%2==0 && a[i]>0) {
				par=(a[i]/a[i])+1;
				if (par>1) {
					System.out.print("*");
					while (par<=a[i]) {
						System.out.print(par+" ");
						par=par+2;	
						System.out.print("| ");
					} 
				}				
			}
		}
		in.close();
	}
}