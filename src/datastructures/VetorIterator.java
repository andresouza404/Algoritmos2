package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class VetorIterator<T> implements Iterator<T> {

	private Vetor<T> container;
	private int current;
	
	public VetorIterator(Vetor<T> container) {
		this.container = container;
		this.current = -1;
	}

	@Override
	public boolean hasNext() {
		return (current + 1) < container.getSize();
	}

	@Override
	public T next() {
		if (hasNext()) {
			current++;
			return container.get(current);
		}
		throw new NoSuchElementException();
	}

}
