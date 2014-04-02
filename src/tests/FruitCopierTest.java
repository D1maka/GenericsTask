package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import task21.Apple;
import task21.FruitCopier;
import task21.RedApple;

public class FruitCopierTest {

	@Test
	public void test() {
		Collection<Apple> apples = new ArrayList<>();
		Collection<RedApple> redApples = new ArrayList<>();
		redApples.add(new RedApple());
		
		int applesNewSize = 1;
		FruitCopier copier = new FruitCopier();
		copier.copyAll(redApples, apples);
		
	}

}
