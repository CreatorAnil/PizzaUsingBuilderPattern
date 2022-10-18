package BuilderPatternPractice;

public class HeadChef {
	private Cook cook;

	public HeadChef(Cook cook) {
		this.cook = cook;
	}
	
	public void makePizza() {
		cook.builddough();
		cook.buildbase();
		cook.buildtoppings();
		cook.buildsauce();
		cook.buildbake();
		cook.buildcheese();
	}

}
