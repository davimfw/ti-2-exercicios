import java.util.Scanner;

public class SomarDoisNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		System.out.println("Digite outro número: ");
		int y = sc.nextInt();
		
		int sum = x + y;
		
		System.out.println("Soma: " + sum);

	}

}
