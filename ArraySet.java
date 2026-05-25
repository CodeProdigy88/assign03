package assign03;

import java.util.Collection;
import java.util.Comparator;

/**
 * A set with operations to add, remove, and query elements.
 *
 * @author Daler Turyssov and Cameron McKay
 * @version 2026-05-24
 *
 * @param <E> - the type of elements contained in this set
 */
public class ArraySet<E> implements Set<E> {
	private E array[];
	private int size;
	private Comparator<? super E> cmp;

	/**
	 * The constructor of the ArraySet object without a comparator
	 */
	public ArraySet() {
		int size = 10;
		@SuppressWarnings("unchecked")
		E[] array = (E[]) new Object[size];
		this.array = array;
		this.size = size;
	}

	/**
	 * The constructor of the ArraySet object with a comparator
	 */
	public ArraySet(Comparator<? super E> cmp) {
		int size = 10;
		@SuppressWarnings("unchecked")
		E[] array = (E[]) new Object[size];
		this.array = array;
		this.size = size;
		this.cmp = cmp;
	}

	/**
	 * A helper method to compare
	 * 
	 * Compares 2 objects. If comparator is null uses default ordering. Otherwise
	 * uses provided comparator.
	 * 
	 * @param item1 - Left Item to compare
	 * @param item2 - Right Item to compare
	 * @return positive integer if left is greater, negative integer if less than, 0
	 *         if eqauls
	 */
	@SuppressWarnings("unchecked")
	public int compare(E item1, E item2, Comparator<? super E> cmp) {
		if (cmp == null) {
			return ((Comparable<? super E>) item1).compareTo(item2);
		}
		return cmp.compare(item1, item2);
	}

	/**
	 * Finds the correct location for an element.
	 *
	 * @param item - the element to add
	 */
	public int binarySearch(E[] array, E target) {
		int lowIndex = 0;
		int highIndex = this.size - 1;

		while (highIndex >= lowIndex) {

			// Find middle cautiously to avoid too high numbers
			int targetIndex = lowIndex + (highIndex - lowIndex) / 2;

			int compareResult = this.compare(target, array[targetIndex], this.cmp);
}

	/**
	 * Adds an element to the set in the correct location.
	 *
	 * @param item - the element to add
	 */
	@Override
	public void add(Object item) {

	}

	/**
	 * Removes and returns an element equal to the given item if such an element is
	 * present.
	 *
	 * @param item - the element to be removed
	 * @return the element that was removed if present; otherwise null
	 */
	@Override
	public Object remove(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Indicates whether this set contains an element equal to the given item.
	 *
	 * @param item - the object to be checked for containment in this set
	 * @return true if the item is contained in this set; otherwise false
	 */
	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Indicates whether this set contains all the elements in the collection. If
	 * the collection is empty, this returns true.
	 *
	 * @param items - a collection of objects to be checked for containment in this
	 *              set
	 * @return true if all items are contained in this set; otherwise false
	 */
	@Override
	public boolean containsAll(Collection items) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Returns all the elements of the set in an array.
	 *
	 * @return array containing all elements of the set
	 */
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the number of elements in the set
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return true if this set is empty; otherwise false
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Removes all the elements from this set, resulting in an empty set.
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
