package task21;

import java.util.Collection;

public class FruitCopier {
	public <T> void copyAll(Collection<? extends T> collection, Collection<? super T> out) {
		for (T fruit: collection) {
			out.add(fruit);
		}
	}
}
