package ComprasOnline;

public class Produto {

	private String titulo;
	private double preco;

	public Produto(String titulo, double preco) {
		this.titulo = titulo;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}
}
