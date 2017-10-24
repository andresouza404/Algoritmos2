package datastructures;

public class ListaEncadeada<T> {

	private static class ListNode<T> {
		private T dado;
		private ListNode<T> proximo;
		public ListNode(T dado) {
			this.dado = dado;
			this.proximo = null;
		}
	}
	
	private ListNode<T> head; 
	private ListNode<T> tail; 
	
	public void append(T dado) {
		ListNode<T> novo = new ListNode<>(dado);
		if (tail != null) {
			tail.proximo = novo;
		} else {
			head = novo;
		}
		tail = novo;
	}
	
	public void print() {
		ListNode<T> i = head;
		while (i != null) {
			System.out.println(i.dado);
			i = i.proximo;
		}
	}
}
