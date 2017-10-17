package ComprasOnline.view;

import datastructures.Vetor;

public class Menu {

	private Vetor<Opcao> opcoes = new Vetor<>();

	private String titulo;

	
	public Menu(String titulo) {
		this.titulo = titulo;
	}

	public void addOpcao(Opcao opcao) {
		opcoes.append(opcao);
		opcao.setAtalho(opcoes.getSize());
	}

	public void execute() {
		exibir();
		executaAcao(Console.readInt("Opcao: "));		
	}
	
	private void exibir() {
		Console.println("--- " + titulo + " ---");
		for (Opcao op: opcoes) {
			Console.println(op.getDisplayFormat());
		}
	}

	private void executaAcao(int atalho) {
		for (Opcao op: opcoes) {
			if (op.executaIf(atalho))
				return;
		}
		Console.println("Opcao invalida!");
	}
	
}
