package ComprasOnline;
import java.util.Scanner;

public class Console {

	private static Scanner teclado = new Scanner(System.in);

	public static void println(String mensagem) {
		System.out.println(mensagem);
	}

	public static String readString() {
		return teclado.nextLine();
	}
	
}
