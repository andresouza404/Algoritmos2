package ComprasOnline;

public class Camiseta extends Produto {
	private int tamanho;
	private String cor;
	
	public Camiseta(String cor, int tamanho, double preco) {
		super(preco);
		this.cor = cor;
		this.tamanho = tamanho;
	}

	@Override
	public String getDescricao() {
		return String.format("Camiseta %s tamanho %d (R$ %.02f)",
							 cor, tamanho, getPreco());
	}
	
}
