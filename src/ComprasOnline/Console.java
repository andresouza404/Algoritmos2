package ComprasOnline;
import java.util.Scanner;

public class Console {

	private static Scanner teclado = new Scanner(System.in);

	public static void println(Object mensagem) {
		System.out.println(mensagem.toString());
	}

	public static String readString() {
		return teclado.nextLine();
	}
	
}
