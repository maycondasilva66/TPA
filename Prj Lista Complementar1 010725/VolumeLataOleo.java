package prjListaComplementar;
import java.util.Scanner;
public class VolumeLataOleo {
	public static void main(String args [] ) {
		Scanner in = new Scanner (System.in);
		double raio, altura, volume;
		System.out.println("Digite o raio da lata de �leo");
		raio = in.nextDouble();
		System.out.println("Digite a altura da lata de �leo");
		altura = in.nextDouble();
		volume = 3.14*altura*(raio*raio);
		System.out.println("O volume da lata de �leo �:" +volume);
		in.close();
	}

}
