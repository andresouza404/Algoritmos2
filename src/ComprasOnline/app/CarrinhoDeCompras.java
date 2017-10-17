package ComprasOnline.app;

import ComprasOnline.app.interfaces.Publisher;
import ComprasOnline.produtos.Produto;
import datastructures.Vetor;

public class CarrinhoDeCompras extends Publisher {
	private Vetor<ItemSelecionado> items = new Vetor<>();
	
	private boolean updateItem(ItemSelecionado item, String id) {
	   if (item.isProduct(id)) {
		   item.add(1);
		   generateEvent(item.getProduto());
		   return true;
	   }
	   return false;
	}
	
	public void addItem(String id, Produto produto) {
		for (ItemSelecionado item: items) {
			if (updateItem(item, id)) {
				return;
			}
		}
		ItemSelecionado novo = new ItemSelecionado(id, produto);
		items.append(novo);
		generateEvent(novo.getProduto());
	}

	public double getTotal() {
		double total = 0.0;
		for (ItemSelecionado item : items) {
			total += item.getValue();
		}		
		return total;
	}

	public String listItems() {
		String result = "Itens no Carrinho:\n";
		for (ItemSelecionado item : items) {
			result += "\t" + item.getProduto().getDescricao() +
					  " [" + item.getQuantidade() + "]" + "\n";
		}
		return result;
	}	
}
