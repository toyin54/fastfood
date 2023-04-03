package src;
public class Client {

    public static void main(String[] args) {
		Director director = new Director();

		System.out.println("Happy Meal Order:");
		Builder happyMealBuilder = new HappyMealBuilder();
		director.setBuilder(happyMealBuilder);
		director.constructFastFoodOrder();
		FastFoodOrder happyMeal = director.getFastFoodOrder();
		happyMeal.show();
		System.out.println("====================================");

		System.out.println("Kids Meal Order:");
		Builder kidsMealBuilder = new KidsMealBuilder();
		director.setBuilder(kidsMealBuilder);
		director.constructFastFoodOrder();
		FastFoodOrder kidsMeal = director.getFastFoodOrder();
		kidsMeal.show();
		System.out.println("====================================");

		System.out.println("Adult Meal Order:");
		Builder adultMealBuilder = new AdultMealBuilder();
		director.setBuilder(adultMealBuilder);
		director.constructFastFoodOrder();
		FastFoodOrder adultMeal = director.getFastFoodOrder();
		adultMeal.show();
		System.out.println("====================================");
	}
    
}
