package prjListaComplementar;
import java.util.Scanner;
public class LucroProduto {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double precoProduto, quantidadeVendida, vendaProduto, valorLucro;
		System.out.println("Digite o pre�o do produto em R$");
		precoProduto = in.nextDouble();
		System.out.println("Digite a quantidade vendida desse produto");
		quantidadeVendida = in.nextDouble();
		System.out.println("Digite o pre�o de venda de cada produto em R$");
		vendaProduto = in.nextDouble();
		valorLucro = (quantidadeVendida*vendaProduto) - (precoProduto*quantidadeVendida);
		System.out.println("O seu valor lucro � de: R$" +valorLucro);
		in.close();
	}

}
