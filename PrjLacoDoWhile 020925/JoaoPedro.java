package prjLacoEnquanto2;
public class JoaoPedro {
	public static void main(String[] args) {
		int i=1, ano=0;
		double joao=134, pedro=145;
		do {
			joao=joao+2.5;
			pedro=pedro+2;
			i++;
			ano=i;
		}while (joao<pedro);
		System.out.println("Ir� demorar "+ano+" anos para que Jo�o seja maior que Pedro.");
	}
}
