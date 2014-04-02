package task21;

import java.util.Collection;

public class FruitCopier {
	public void  copyAll(Collection<? extends Fruit> collection, Collection<? super Fruit> out) {
		for (Fruit fruit: collection) {
			out.add(fruit);
		}
	}
}
