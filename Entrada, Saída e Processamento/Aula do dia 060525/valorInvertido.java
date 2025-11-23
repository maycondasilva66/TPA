package prjAula02;
import java.util.Scanner;

public class valorInvertido {
	public static void main(String[] args) {
		
		//criando um scanner chamado ler
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Entre com o valor a:");
		a = ler.nextInt();
		
		System.out.println("Entre com o valor b:");
		b = ler.nextInt();
		
		System.out.println("Entre com o valor c:");
		c = ler.nextInt();
		
		c = a;
		a = b;
		b = c;
		System.out.println("O valor de a é:"+a);
		System.out.println("O valor de b é:"+b);
		System.out.println("O valor de c é:"+c);
		ler.close();
		
		
	}

}
