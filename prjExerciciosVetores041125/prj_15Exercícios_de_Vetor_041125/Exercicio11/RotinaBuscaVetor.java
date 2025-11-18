package prjExerciciosVetores;
import java.util.Scanner;
public class RotinaBuscaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],i,x,j=0;
		a = new int[TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° elemento de A ");
			a[i] = in.nextInt();
		}
		System.out.println("Digite um número x para checarmos se existe entre os elementos em A:  ");
		x = in.nextInt();
		for (i=0;i<TAM;i++) {
			j=0;
			if (x==a[i]) {
				System.out.println("Esse número "+x+" faz parte de A na "+(i+1)+"° posição");
				i=TAM-1;
			}else {
				j=1;
			}	
		}
		if (j==1) {
			System.out.println("O número "+x+" não faz parte de A");
		}
		in.close();
	}
}