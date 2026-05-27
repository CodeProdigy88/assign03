package assign03;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
	private ArraySet<Integer> customRev;

	@BeforeEach
	void setUp() {
		Comparator<Integer> customRev = ((Comparator<Integer>) (u1, u2) -> u1.compareTo(u2) * -1);
	

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
	void testCreateArray() {
		ArraySet set = new ArraySet();
	
		assertNotEquals(set.customRev() , set);
	}

	@Test
	void testSameArray() {
		ArraySet set = new ArraySet();
		set.add(1);
		set.add(2);
		ArraySet set2 = new ArraySet();
		set2.add(1);
		set2.add(2);
		assertEquals(set.size(), set2.size());
	}

}
