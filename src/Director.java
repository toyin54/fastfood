package src;
class Director {
  
    private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public FastFoodOrder getFastFoodOrder() {
		return builder.getResult();
	}

	public void constructFastFoodOrder() {
		builder.buildBurger();
		builder.buildDrink();
		builder.buildSide();
		builder.buildToy();
	}
}
