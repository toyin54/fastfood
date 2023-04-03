class FastFoodOrder {

    private String burger;
	private String drink;
	private String side;
	private String toy;


	public void setBurger(String burger) {
		this.burger = burger;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	public void show() {
		System.out.println("Burger: " + burger);
		System.out.println("Drink: " + drink);
		System.out.println("Side: " + side);
		System.out.println("Toy: " + toy);
	}
}
