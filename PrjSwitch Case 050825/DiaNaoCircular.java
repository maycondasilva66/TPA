package prj05082025;
import java.util.Scanner;
public class DiaNaoCircular {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p;
		System.out.println("Digite o n�mero final da sua placa:");
		p = in.nextInt();
		
		switch(p) {
			case 1:
			case 2:
				System.out.println("N�o poder� circular na Segunda-Feira");
				break;
			case 3:
			case 4:
				System.out.println("N�o poder� circular na Ter�a-Feira");
				break;
			case 5:
			case 6:
				System.out.println("N�o poder� circular na Quarta-Feira");
				break;
			case 7:
			case 8:
				System.out.println("N�o poder� circular na Quinta-Feira");
				break;
			case 9:
			case 0:
				System.out.println("N�o poder� circular na Sexta-Feira");
				break;
			default:	
				System.out.println("N�mero inv�lido");
		}
		in.close();
	}

}
