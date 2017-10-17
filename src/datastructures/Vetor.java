package datastructures;

import java.util.Iterator;

public class Vetor<T> implements Iterable<T> {

	private int numObjects = 0;
	private Object[] objects = new Object[4];

	public void append(T o) {
		if (numObjects == objects.length) {
			aumentarTamanhoVetor();
		}
		objects[numObjects] = o;
		numObjects++;
	}

	private void aumentarTamanhoVetor() {
		Object[] novo = new Object[objects.length*2];
		for (int i =0; i < objects.length; i++) {
			novo[i] = objects[i];
		}
		objects = novo;
	}

	public int getSize() {
		return numObjects;
	}

	@SuppressWarnings("unchecked")
	public T get(int i) {
		if (i >= 0 && i < numObjects) {
			return (T)objects[i];
		}
		throw new ArrayIndexOutOfBoundsException(i); 
	}

	@Override
	public Iterator<T> iterator() {
		return new VetorIterator<T>(this);
	}
}
