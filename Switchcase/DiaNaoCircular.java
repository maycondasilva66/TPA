package prj05082025;
import java.util.Scanner;
public class DiaNaoCircular {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p;
		System.out.println("Digite o número final da sua placa:");
		p = in.nextInt();
		
		switch(p) {
			case 1:
			case 2:
				System.out.println("Não poderá circular na Segunda-Feira");
				break;
			case 3:
			case 4:
				System.out.println("Não poderá circular na Terça-Feira");
				break;
			case 5:
			case 6:
				System.out.println("Não poderá circular na Quarta-Feira");
				break;
			case 7:
			case 8:
				System.out.println("Não poderá circular na Quinta-Feira");
				break;
			case 9:
			case 0:
				System.out.println("Não poderá circular na Sexta-Feira");
				break;
			default:	
				System.out.println("Número inválido");
		}
		in.close();
	}

}
