package assign03;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * This class contains tests for UofUStudent.
 * 
 * @author Cameron McKay and Daler Turyssov
 * @version 2025-05-15
 */

class ArraySetTest {

	@Test
	void testCreateArray() {
				ArraySet set= new ArraySet();
				assertEquals(set, set);		
	}
	
	@Test
	void testSameArray() {
				ArraySet set= new ArraySet();
				set.add(1);
				set.add(2);
				ArraySet set2= new ArraySet();
				set2.add(1);
				set2.add(2);
				assertEquals(set.size(), set2.size());	
	}
	
	
	
}
