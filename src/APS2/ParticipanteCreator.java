package APS2;

public class ParticipanteCreator
	implements CSVReader.Creator<Participante>
{
	@Override
	public Participante fromString(String line) {
		String[] data = line.split(",");
		return new Participante(data[0],data[1]);
	}
}
