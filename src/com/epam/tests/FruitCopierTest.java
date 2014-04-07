package com.epam.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.epam.generics.Apple;
import com.epam.generics.FruitCopier;
import com.epam.generics.RedApple;


public class FruitCopierTest {

	@Test
	public void testRedApplesCollectionCopiedToEmptyApplesCollectionSizeSame() {
		Collection<Apple> apples = new ArrayList<>();
		Collection<RedApple> redApples = new ArrayList<>();
		redApples.add(new RedApple(1));

		int applesExpectedSize = 1;
		FruitCopier copier = new FruitCopier();
		copier.copyAll(redApples, apples);
		assertEquals(apples.size(), applesExpectedSize);
	}

	@Test
	public void testRedApplesSizeFiveFilteredByTheFirstElementResultSizeFour() {
		Collection<Apple> apples = new ArrayList<>();
		ArrayList<RedApple> redApples = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			redApples.add(new RedApple(i));
		}
		RedApple midApple = redApples.get(0);
		int applesExpectedSize = 4;
		FruitCopier copier = new FruitCopier();
		apples =  (Collection<Apple>) copier.getNewFilteredCollection(redApples, midApple);
		assertEquals(apples.size(), applesExpectedSize);
	}
	
	@Test
	public void testApplesSizeFiveFilteredByTheFirstElementResultSizeFour() {
		Collection<Apple> apples = new ArrayList<>();
		ArrayList<Apple> notFilteRedApples = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			notFilteRedApples.add(new Apple(i));
		}
		Apple midApple = notFilteRedApples.get(0);
		int applesExpectedSize = 4;
		FruitCopier copier = new FruitCopier();
		apples =  (Collection<Apple>) copier.getNewFilteredCollection(notFilteRedApples, midApple);
		assertEquals(apples.size(), applesExpectedSize);
	}
}
