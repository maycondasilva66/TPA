package prjListaComplementar;
import java.util.Scanner;
public class Passeio {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int destino, dias, custo;
		System.out.println("Digite o seu destino (1 - Ilhabela | 2 - Fernando de Noronha):");
		destino = in.nextInt();
		System.out.println("Digite o número de dias que deseja viajar:");
		dias = in.nextInt();
		if (destino == 1) {
			if (dias<=5) {
				custo = (dias*240);
				System.out.println("O custo dessa viagem é de: R$" +custo);
			} else if (dias<10) {
				custo = (dias*220) +130;
				System.out.println("O custo dessa viagem é de: R$" +custo);
			} else {
				custo = (dias*210) +150;
				System.out.println("O custo dessa viagem é de: R$" +custo);
			} 
		} if (destino == 2) {
			if (dias<=5) {
				custo = (dias*400) +100;
				System.out.println("O custo dessa viagem é de: R$" +custo);
			} else if (dias<10) {
				custo = (dias*410) +150;
				System.out.println("O custo dessa viagem é de: R$" +custo);
			} else {
				custo = (dias*420) +200;
				System.out.println("O custo dessa viagem é de: R$" +custo);
			}
		}
		in.close();
	}

}
