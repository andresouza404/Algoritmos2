package datastructures;

import java.util.Iterator;

public class Vetor<T> implements Iterable<T> {

	private int numObjects = 0;
	private Object[] objects = new Object[4];

	public void insert(int index, T o) {
		if (index >=0 && index <= numObjects) {
			garanteEspacoDisponivel();
			int count = numObjects - index;
			System.arraycopy(objects, index, objects, index+1, count);
			objects[index] = o;
			numObjects++;
		} else {
			throw new ArrayIndexOutOfBoundsException(index);
		}
	}
	
	private void garanteEspacoDisponivel() {
		if (numObjects == objects.length) {
			aumentarTamanhoVetor();
		}
	}

	public void append(T o) {
		garanteEspacoDisponivel();
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
