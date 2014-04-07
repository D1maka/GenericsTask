package com.epam.generics;

import java.util.Collection;

public class ArrayToCollectionConverter {

	public <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T object : a) {
			c.add(object);
		}
	}

}
