package prjLacoEnquanto2;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int idade, opcao;
		int i=0, faixa1=0, faixa2=0, faixa3=0, faixa4=0, faixa5=0;
		double pfaixa1, pfaixa2, pfaixa3, pfaixa4, pfaixa5;
		do {
			System.out.println("Digite a idade:");
			idade = in.nextInt();
			if (idade<=15) {
				System.out.println("1�Faixa");
				faixa1++;
			}else if (idade<=30) {
				System.out.println("2�Faixa");
				faixa2++;
			}else if (idade<=45) {
				System.out.println("3�Faixa");
				faixa3++;
			}else if (idade<=60) {
				System.out.println("4�Faixa");
				faixa4++;
			}else {
				System.out.println("5�Faixa");
				faixa5++;
			}
			i++;
			System.out.println("Deseja continuar? (1-Sim / 2-N�o):");
			opcao = in.nextInt();
		}while (opcao==1);
		pfaixa1 = (faixa1*100) /i;
		pfaixa2 = (faixa2*100) /i;
		pfaixa3 = (faixa3*100) /i;
		pfaixa4 = (faixa4*100) /i;
		pfaixa5 = (faixa5*100) /i;
		
		System.out.println("A quantidade de pessoas na 1�Faixa et�ria � de " +faixa1+ " e a porcentagem � de " +pfaixa1+ "%");
		
		System.out.println("A quantidade de pessoas na 2�Faixa et�ria � de " +faixa2+ " e a porcentagem � de " +pfaixa2+ "%");
		
		System.out.println("A quantidade de pessoas na 3�Faixa et�ria � de " +faixa3+ " e a porcentagem � de " +pfaixa3+ "%");
		
		System.out.println("A quantidade de pessoas na 4�Faixa et�ria � de " +faixa4+ " e a porcentagem � de " +pfaixa4+ "%");
		
		System.out.println("A quantidade de pessoas na 5�Faixa et�ria � de " +faixa5+ " e a porcentagem � de " +pfaixa5+ "%");
		
		in.close();
	}
}