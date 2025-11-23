package prjLista141025;
import java.util.Scanner;  
public class DiaMesAno {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1,dia,mes,ano;
		do {
			System.out.println("Digite o dia:");
			dia = in.nextInt();
			System.out.println("Digite o mês:");
			mes = in.nextInt();
			System.out.println("Digite o ano:");
			ano = in.nextInt();
			switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if (dia>=1 && dia<31) {
					dia=dia+1;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else if (dia==31) {
					dia=1;
					mes++;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else {
					System.out.println("Dia inválido");
				}
			break;
			case 2:
				if (ano%4==0) {
					if (dia>=1 && dia<29) {
						dia++;
						System.out.println(dia+"/"+mes+"/"+ano);
					}else if (dia==29) {
							mes++;
							dia=1;
							System.out.println(dia+"/"+mes+"/"+ano);
						}else {
							System.out.println("Dia inválido");
						}
				}else if (dia==28) {
					dia++;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else if (dia>=1 && dia<29) {
					dia++;
					System.out.println(dia+"/"+mes+"/"+ano);
					}else {
						System.out.println("Dia inválido");
					}
			break;	
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia==30) {
					mes++;
					dia=1;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else if (dia<30 && dia>=1) {
					dia++;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else {
					System.out.println("Dia inválido");
				}
			break;
			case 12:
				if (dia==31) {
					dia=1;
					ano++;
					mes=1;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else if (dia>=1 && dia<31) {
					dia++;
					System.out.println(dia+"/"+mes+"/"+ano);
				}else {
					System.out.println("Dia inválido");
				}
			break;
			default:
				System.out.println("Mês inválido");
			}
			System.out.println("Deseja continuar? 1-Sim / 2-Não");
			i = in.nextInt();
		}while(i==1);
		System.out.println("Fim do programa");
		in.close();
	}
}