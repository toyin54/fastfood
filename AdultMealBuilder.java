public class AdultMealBuilder implements Builder {
	private FastFoodOrder order = new FastFoodOrder();

	@Override
	public void buildBurger() {
		order.setBurger("Double Cheeseburger");
	}

	@Override
	public void buildDrink() {
		order.setDrink("Coke XLarge");
	}

	@Override
	public void buildSide() {
		order.setSide("Onion Rings");
	}

	@Override
	public void buildToy() {
		order.setToy("No Toy");
	}

	@Override
	public FastFoodOrder getResult() {
		return order;
	}
}