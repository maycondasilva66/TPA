package prjExerciciosVetores;
import java.util.Scanner;
public class LeiFormacaoParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],b[],i;
		a = new int[TAM];
		b = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento de A ");
			a[i] = in.nextInt();
		}
		System.out.println("Lei de formação segundo as regras:");
		for (i=0;i<TAM;i++) {
			if (a[i]%2==0) {
				b[i]=1;
				System.out.print(b[i]+" ");
			}else {
				b[i]=0;
				System.out.print(b[i]+" ");
			}
		}
		in.close();
	}
}