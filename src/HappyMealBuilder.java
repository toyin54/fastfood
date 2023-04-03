package src;
public class HappyMealBuilder implements Builder{
    private FastFoodOrder order = new FastFoodOrder();

	@Override
	public void buildBurger() {
		order.setBurger("Hambuger");
	}

	@Override
	public void buildDrink() {
		order.setDrink("Coke Zero");
	}

	@Override
	public void buildSide() {
		order.setSide("French Fries");
	}

	@Override
	public void buildToy() {
		order.setToy("Toy Bundle 1");
	}

	@Override
	public FastFoodOrder getResult() {
		return order;
	}
}
