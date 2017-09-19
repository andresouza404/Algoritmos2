package ComprasOnline;

abstract public class Produto {

	private String sku;
	private double preco;
	
	@Override
	public String toString() {
		return getDescricao();
	}

	public Produto(String sku, double preco) {
		this.sku = sku;
		this.preco = preco;
	}
	
	public String getSku() {
		return sku;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	abstract public String getDescricao();
}
