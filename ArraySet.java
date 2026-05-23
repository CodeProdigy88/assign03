package assign03;

import java.util.Collection;
import java.util.Comparator;



public class ArraySet<E> implements Set<E> {
	private E array[];
	private int size;
	private Comparator cmp;
	private boolean hasComparator;
	
	public ArraySet() {
		int size = 10;
		E[] array = (E[]) new Object[size];
		this.array = array;
		this.size = size;
			}

	public ArraySet(Comparator<? super E> cmp) {
		int size = 10;
		E[] array = (E[]) new Object[size];
		this.array = array;
		this.size = size;
		this.cmp = cmp;
			}
	
	@SuppressWarnings("unchecked")
	public int compare(E item1, E item2) {
	 return ((Comparable<? super E>) item1).compareTo(item2); 
	
	}
	
	@SuppressWarnings("unchecked")
	public int compare(E item) {
	 return ((Comparable<? super E>) this).compareTo(item); 
	
	}
	public Object binarySearch() {
        
    }
	

	@Override
	public void add(Object item) {

	}

	@Override
	public Object remove(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
	
	

}
