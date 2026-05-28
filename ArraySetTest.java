package assign03;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

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

	// General Tests

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

	@Test
	void testClear() {
		ArraySet<Integer> set = new ArraySet<>();
		set.add(1);
		assertEquals(1, set.size());
		set.clear();
		assertEquals(0, set.size());
	}

	@Test
	void testClearEmpty() {
		ArraySet<Integer> set = new ArraySet<>();
		assertEquals(0, set.size());
		assertTrue(set.isEmpty());
		set.clear();
		assertEquals(0, set.size());
		assertTrue(set.isEmpty());
	}

	@Test
	void testToArray() {
		ArraySet<Integer> set = new ArraySet<>();
		set.add(1);
		set.add(2);
		Object[] array1 = set.toArray();
		Object[] array2 = { 1, 2 };
		assertArrayEquals(array1, array2);
	}

	@Test
	void testRemove() {
		ArraySet<Integer> set = new ArraySet<>();
		set.add(1);
		set.remove(1);
		Object[] array1 = set.toArray();
		Object[] array2 = {};
		assertArrayEquals(array1, array2);
	}

	@Test
	void testRemoveNull() {
		ArraySet<Integer> set = new ArraySet<>();
		set.add(1);
		Integer nullValue = set.remove(2);
		assertEquals(null, nullValue);
		int removed = set.remove(1);
		assertEquals(1, removed);
	}

	@Test
	void testIncreaseSize() {
		ArraySet<Integer> set = new ArraySet<>();
		for (int i = 0; i < 9; i++) {
			set.add(i);
		}
		assertEquals(9, set.size());
		set.add(10);
		assertEquals(10, set.size());
	}

	@Test
	void testNoChanges() {
		ArraySet<Integer> set = new ArraySet<>();
		for (int i = 0; i < 9; i++) {
			set.add(i);
		}
		assertEquals(9, set.size());
		Object[] array1 = set.toArray();
		set.add(10);
		set.remove(10);
		assertEquals(9, set.size());
		for (int i = 0; i < 100; i++) {
			set.add(10);
			set.remove(10);
		}
		Object[] array2 = set.toArray();
		assertArrayEquals(array1, array2);
	}

	// Specific Tests

	@Test
	void emptySetOrdering() {
		// Manually put in the correct order
		Object[] expectedOrder = {};
		Object[] actualOrder = emptySet.toArray();
		assertArrayEquals(expectedOrder, actualOrder);

	}

	@Test
	void emptySetAdd() {
		Object[] expectedOrder = { 1 };
		emptySet.add(1);
		Object[] actualOrder = emptySet.toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void emptySetRemove() {
		Object[] expectedOrder = {};
		emptySet.remove(0);
		Object[] actualOrder = emptySet.toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void emptySetReverse() {
		ArraySet<Integer> rEmptySet = new ArraySet<>(reverseComparator);
		Object[] actualOrder = rEmptySet.toArray();
		Object[] reverseOrder = new Object[actualOrder.length];
		for (int i = actualOrder.length - 1; i >= 0; i--) {
			reverseOrder[actualOrder.length - 1 - i] = actualOrder[i];
			assertArrayEquals(reverseOrder, actualOrder);

		}
	}

	@Test
	void stringSetOrdering() {
		//Manually put in the correct order
		Object[] expectedOrder = {};
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);

	}

	@Test
	void stringSetAdd() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void stringSetRemove() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void stringSetReverse() {
		reverseSet = ;
		Object[] actualOrder = .toArray();
		Object[] reverseOrder = new Object[actualOrder.length];
		for(int i = actualOrder.length - 1; i >= 0; i--) {
			reverseOrder[actualOrder.length - 1 - i] = actualOrder[i];
		}
	}

	@Test
	void sortedSetOrdering() {
		//Manually put in the correct order
		Object[] expectedOrder = {};
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);

	}

	@Test
	void sortedSetAdd() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void sortedSetRemove() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void sortedSetReverse() {
		reverseSet = ;
		Object[] actualOrder = .toArray();
		Object[] reverseOrder = new Object[actualOrder.length];
		for(int i = actualOrder.length - 1; i >= 0; i--) {
			reverseOrder[actualOrder.length - 1 - i] = actualOrder[i];
		}
	}

	@Test
	void unSortedSetOrdering() {
		//Manually put in the correct order
		Object[] expectedOrder = {};
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);

	}

	@Test
	void unSortedSetAdd() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void unSortedSetRemove() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void unSortedSetReverse() {
		reverseSet = ;
		Object[] actualOrder = .toArray();
		Object[] reverseOrder = new Object[actualOrder.length];
		for(int i = actualOrder.length - 1; i >= 0; i--) {
			reverseOrder[actualOrder.length - 1 - i] = actualOrder[i];
		}
	}

	@Test
	void oneLengthSetOrdering() {
		//Manually put in the correct order
		Object[] expectedOrder = {};
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);

	}

	@Test
	void oneLengthSetAdd() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void oneLengthSetRemove() {
		Object[] expectedOrder = {};
		.add()
		Object[] actualOrder = .toArray();
		assertArrayEquals(expectedOrder, actualOrder);
	}

	@Test
	void oneLengthSetReverse() {
		reverseSet = ;
		Object[] actualOrder = .toArray();
		Object[] reverseOrder = new Object[actualOrder.length];
		for(int i = actualOrder.length - 1; i >= 0; i--) {
			reverseOrder[actualOrder.length - 1 - i] = actualOrder[i];
		}
	}

}
