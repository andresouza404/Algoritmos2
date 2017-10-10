package datastructures;

public class Vetor {

	private int numObjects = 0;
	private Object[] objects = new Object[4];

	public void append(Object o) {
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

	public Object get(int i) {
		if (i >= 0 && i < numObjects) {
			return objects[i];
		}
		throw new ArrayIndexOutOfBoundsException(i); 
	}
}
