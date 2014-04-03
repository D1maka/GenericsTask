package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import task1.Apple;
import task1.FruitCopier;
import task1.RedApple;

public class FruitCopierTest {

	@Test
	public void testRedApplesCollectionCopiedToEmptyApplesCollectionSizeSame() {
		Collection<Apple> apples = new ArrayList<>();
		Collection<RedApple> redApples = new ArrayList<>();
		redApples.add(new RedApple());
		
		int applesExpectedSize = 1;
		FruitCopier copier = new FruitCopier();
		copier.copyAll(redApples, apples);
		assertEquals(apples.size(), applesExpectedSize);
	}
}
