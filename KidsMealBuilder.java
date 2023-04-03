
public class KidsMealBuilder implements Builder {
	private FastFoodOrder order = new FastFoodOrder();

	@Override
	public void buildBurger() {
		order.setBurger("Chicken Burger");
	}

	@Override
	public void buildDrink() {
		order.setDrink("Apple Juice");
	}

	@Override
	public void buildSide() {
		order.setSide("Chicken Nuggets");
	}

	@Override
	public void buildToy() {
		order.setToy("Toy Bundle 2");
	}

	@Override
	public FastFoodOrder getResult() {
		return order;
	}
}

