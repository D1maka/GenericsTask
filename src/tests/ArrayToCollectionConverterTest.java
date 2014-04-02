package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import task1.ArrayToCollectionConverter;

public class ArrayToCollectionConverterTest {
	
	

	@Test
	public void testCopyIntegerArrayToIntegerCollectionSizeChanged() {
		Integer[] intsArray = {0, 1, 2};
		Collection<Integer> intsCollection = new ArrayList<Integer>();
		int newSize = 3;
		
		ArrayToCollectionConverter converter = new ArrayToCollectionConverter();
		converter.fromArrayToCollection(intsArray, intsCollection);
		int collectionSize = intsCollection.size();
		assertTrue(newSize == collectionSize);
	}
}
