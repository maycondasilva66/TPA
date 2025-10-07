package prjAula08;
import java.util.Scanner;
public class Idade {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.println ("Coloque sua idade");
		idade = ler.nextInt();
		if(idade<10) {
			System.out.println ("Criança");
		}else if(idade<18) {
			System.out.println ("Adolescente");
		}else if(idade<60) {
			System.out.println ("Adulto");
		}else {
			System.out.println ("Idoso");
			ler.close();
		}
		
		
	}
	   
	

}
