package prjLacoFor;
import java.util.Scanner;
public class IdadeAlturaPeso25Pessoas {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, idade,qntIdade50=0,qntIdade10a20=0,qntPesoMenor40=0;
		double altura,peso,somaAltura10a20=0;
		int idadeMaisVelha=0,idadeMaisNova=999;
		
		for (i=1;i<=25;i++) {
			System.out.println("Digite a idade:");
			idade = ler.nextInt();
			System.out.println("Digite a altura em centímetros:");
			altura = ler.nextInt();
			System.out.println("Digite o peso em kg:");
			peso = ler.nextInt();
			if (idade>50) {
				qntIdade50++;			
				}
			if (idade >= 10) {
			    if (idade <= 20) {
			        somaAltura10a20 += altura;
			        qntIdade10a20++;
			    }
			}
			if (peso<40) {
				qntPesoMenor40++;
			}
			if (idade>idadeMaisVelha) {
				idadeMaisVelha=idade;
			}
			if (idade<idadeMaisNova) {
				idadeMaisNova=idade;
			}
			}

		double mediaAltura = 0;
		if (qntIdade10a20>0) {
			mediaAltura=somaAltura10a20/qntIdade10a20;
		}else {
			mediaAltura=0;
		}
		double porcentagemPesoMenor40 = (qntPesoMenor40/25) *100;
		
		System.out.println("Quantidade de pessoas com idade maior que 50: " +qntIdade50);
        System.out.println("Média de altura (10 a 20 anos): " +mediaAltura+ " centímetros");
        System.out.println("Percentagem de pessoas com peso menor que 40 kg: " +porcentagemPesoMenor40+ "%");
        System.out.println("Idade da pessoa mais velha: " +idadeMaisVelha);
        System.out.println("Idade da pessoa mais nova: " +idadeMaisNova);
		ler.close();

	 }
 }