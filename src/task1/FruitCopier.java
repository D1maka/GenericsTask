package task1;

import java.util.ArrayList;
import java.util.Collection;

public class FruitCopier {
	public <T> void copyAll(Collection<? extends T> collection,
			Collection<? super T> out) {
		for (T fruit : collection) {
			out.add(fruit);
		}
	}

	public <T extends Apple & Comparable<Apple>> Collection<? super T> getNewFilteredCollection(
			Collection<? extends T> collection, T element) {
		Collection<Apple> filtereCollection = new ArrayList<>();
		for (T t : collection) {
			if (t.compareTo(element) > 0) {
				filtereCollection.add(t);
			}
		}
		return filtereCollection;
	}
	
	
}
