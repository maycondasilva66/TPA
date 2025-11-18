package prjExerciciosVetores;
import java.util.Scanner;
public class IntersecaoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],b[],c[],i,j;
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
		System.out.println("A interseção de A e B é:");
		for (i=0;i<TAM;i++) {
			for (j=0;j<TAM;j++) {
				if (a[i]==b[j]) {
					c[i]=a[i];
					System.out.print(c[i]+" ");
				}
			}
		}
		in.close();
	}
}