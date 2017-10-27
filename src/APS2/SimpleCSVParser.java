package APS2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleCSVParser {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("data/participantes.csv"));
			// Altera o delimitador do scanner para
			// vírgula ou "nova linha" (\n).
			sc.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return;
		}
		
		while (sc.hasNext()) {
			Participante p = new Participante(sc.next(),sc.next());
			System.out.println(p);
		}
		
		sc.close();
	}

}
