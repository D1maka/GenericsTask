package task1;

public class Apple extends Fruit implements Comparable<Apple> {

	private int id;
	
	public Apple(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(Apple o) {
		if (id > o.getId()) {
			return 1;
		} else if (id == o.getId()) {
			return 0;
		} else {
			return -1;
		}
	}

}
