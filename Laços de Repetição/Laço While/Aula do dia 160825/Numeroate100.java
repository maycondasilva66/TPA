package prjLacoRepeticao;
import java.util.Scanner;
public class Numeroate100 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1;
		while (i<=100) {
			System.out.println(""+i+"");
			i++;
		}
		in.close();
	}

}
