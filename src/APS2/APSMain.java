package APS2;

import java.io.FileNotFoundException;

public class APSMain {

	public static void main(String[] args) {
		String filename = "data/participantes.csv";
		ParticipanteCreator creator = new ParticipanteCreator();
		CSVReader<Participante> reader;
		try {
			reader = new CSVReader<>(new java.io.FileInputStream(filename),creator);
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado: " + filename);
			return;
		}
		
		while (reader.hasNext()) {
			Participante p = reader.next();
			System.out.println(p);
		}
	}

}
