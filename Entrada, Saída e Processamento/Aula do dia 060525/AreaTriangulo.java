package prjAula02;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		//criando um scanner chamado ler
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		base = ler.nextDouble();
		altura = ler.nextDouble();
		
	    area = (base*altura) /2;
		System.out.println("A área do triângulo é ="+area);
		ler.close();
	}

}
