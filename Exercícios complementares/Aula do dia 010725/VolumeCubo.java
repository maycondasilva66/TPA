package prjListaComplementar;
import java.util.Scanner;
public class VolumeCubo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double l, volume;
		System.out.println("Digite a medida das arestas");
		l = in.nextDouble();
		volume = l*l*l;
		System.out.println("O volume do cubo é:" +volume);
		in.close();
	}

}
