package prjExerciciosVetores;
import java.util.Scanner;
public class PotenciaDe2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=11;
		int a[],i,j=1;
		a = new int[TAM];
		for (i=0;i<TAM;i++) {
			a[i]=j;
			j=j*2;
		}
		for (i=0;i<TAM;i++) {
			System.out.println("2 elevado a "+i+" = "+a[i]);
		}
		in.close();
	}
}