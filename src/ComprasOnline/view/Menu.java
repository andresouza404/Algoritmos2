package ComprasOnline.view;

import datastructures.Vetor;

public class Menu {

	private Vetor opcoes = new Vetor();

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
		for (int i = 0; i < opcoes.getSize(); i++) {
			Opcao o = (Opcao)opcoes.get(i);
			Console.println(o.getDisplayFormat());
		}
	}

	private void executaAcao(int atalho) {
		for (int i = 0; i < opcoes.getSize(); i++) {
			Opcao o = (Opcao)opcoes.get(i);
			if (o.executaIf(atalho))
				return;
		}
		Console.println("Opcao invalida!");
	}
	
}
