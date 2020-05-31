package collection;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

	private static final int DEFAULT_CAPACITY = 10;
	private int theSize;
	private T[] theItems;

	public MyArrayList() {
		doClear();
	}

	public void clear() {
		doClear();
	}

	private void doClear() {
		theSize = 0;
		ensureCapacity(DEFAULT_CAPACITY);
	}

	public int size() {
		return theSize;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void trimToSize() {
		ensureCapacity(size());
	}

//	if (idx < 0 || idx <= size)
//		throw new ArrayIndexOutOfBoundsException()

	private void ensureCapacity(int newCapacity) {
		if (newCapacity < theSize)
			return;
		T[] old = theItems;
		theItems = (T[]) new Object[newCapacity];
		for (int i = 0; i < size(); i++) {
			theItems[i] = old[i];
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
