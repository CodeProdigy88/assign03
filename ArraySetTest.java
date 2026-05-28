package assign03;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class contains tests for UofUStudent.
 * 
 * @author Cameron McKay and Daler Turyssov
 * @version 2025-05-15
 */

class ArraySetTest {
	private ArraySet<Integer> emptySet;
	private ArraySet<String> stringSet;
	private ArraySet<Integer> sortedSet;
	private ArraySet<Integer> unSortedSet;
	private ArraySet<Integer> oneLengthSet;
	private Comparator<Integer> reverseComparator;

	@BeforeEach
	void setUp() {
		reverseComparator = ((u1, u2) -> u2.compareTo(u1));

		emptySet = new ArraySet<>();

		stringSet = new ArraySet<>();
		stringSet.add("september");
		stringSet.add("october");
		stringSet.add("november");
		stringSet.add("december");
		stringSet.add("january");
		stringSet.add("february");
		stringSet.add("march");
		stringSet.add("april");
		stringSet.add("may");
		stringSet.add("june");
		stringSet.add("july");
		stringSet.add("august");

		sortedSet = new ArraySet<>();
		sortedSet.add(1);
		sortedSet.add(2);
		sortedSet.add(3);
		sortedSet.add(4);
		sortedSet.add(5);

		unSortedSet = new ArraySet<>();
		unSortedSet.add(5);
		unSortedSet.add(4);
		unSortedSet.add(3);
		unSortedSet.add(2);
		unSortedSet.add(1);

		oneLengthSet = new ArraySet<>();
		oneLengthSet.add(100);

	}

	@Test
	void testSetUp() {
		assertEquals(emptySet, emptySet);

	}

	@Test
	void testComparator() {
		ArraySet<Integer> set = new ArraySet<>();
		set.add(1);
		ArraySet<Integer> setReverse = new ArraySet<>(reverseComparator);
		setReverse.add(1);
		assertArrayEquals(set.toArray(), setReverse.toArray());
		set.add(2);
		setReverse.add(2);
		Object[] array1 = set.toArray();
		Object[] array2 = setReverse.toArray();
		assertNotEquals(array1[0], array2[0]);
	}

	@Test
	void testSameArray() {
		ArraySet<Integer> set = new ArraySet<>();
		set.add(1);
		set.add(2);
		ArraySet<Integer> set2 = new ArraySet<>();
		set2.add(1);
		set2.add(2);
		assertArrayEquals(set.toArray(), set2.toArray());
	}

	// Test ideas: Add remove a bunch in a row
	// check size at increase and decrease point

}
