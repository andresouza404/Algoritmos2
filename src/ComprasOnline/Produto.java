package ComprasOnline;

abstract public class Produto {

	private double preco;
	
	@Override
	public String toString() {
		return getDescricao();
	}

	public Produto(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	abstract public String getDescricao();
}
