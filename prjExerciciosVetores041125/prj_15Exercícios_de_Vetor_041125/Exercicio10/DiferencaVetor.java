package prjExerciciosVetores;
import java.util.Scanner;
public class DiferencaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],b[],c[],i,j,r;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento de A ");
			a[i] = in.nextInt();
		}
		for (j=0;j<TAM;j++) {
			System.out.println("Digite o "+(j+1)+"° elemento de B ");
			b[j] = in.nextInt();
		}
		System.out.println("A diferença de A que não existem em B é:");
		for (i=0;i<TAM;i++) {
			r=0;
			for (j=0;j<TAM;j++) {
				if (a[i]!=b[j]) {
					r=a[i];
				}else {
					r=0;
					j=TAM-1;
				}
			}
			if (r!=0) {
				c[i]=r;
				System.out.print(c[i]+" ");
			}
		}
		in.close();
	}
}