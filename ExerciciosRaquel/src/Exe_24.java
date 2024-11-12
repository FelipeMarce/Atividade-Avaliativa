import java.util.Scanner;

public class Exe_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o preço de fabrica do veiculo: ");
		double preco = sc.nextDouble();

		preco = preco * 0.28 + preco;
		preco = preco * 0.45 + preco;
		
		System.out.println("Preço de consumidor do veiculo: " + preco);
		sc.close();
	}

}
