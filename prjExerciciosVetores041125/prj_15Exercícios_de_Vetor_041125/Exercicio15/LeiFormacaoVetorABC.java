package prjExerciciosVetores;
import java.util.Scanner;
public class LeiFormacaoVetorABC {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],b[],c[],i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento de A ");
			a[i] = in.nextInt();
		}
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento de B ");
			b[i] = in.nextInt();
		}
		System.out.println("Lei de formação segundo as regras:");
		for (i=0;i<TAM;i++) {
			if (a[i]>b[i]) {
				c[i]=1;
				System.out.print(c[i]+" ");
			}else if (a[i]==b[i]) {
				c[i]=0;
				System.out.print(c[i]+" ");
			}else {
				c[i]=-1;
				System.out.print(c[i]+" ");
			}
		}
		in.close();
	}
}