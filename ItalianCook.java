package BuilderPatternPractice;

public class ItalianCook implements Cook {
	
	private Pizza pizza;
	
	public ItalianCook() {
		this.pizza = new Pizza();
	}

	@Override
	public void builddough() {
		// TODO Auto-generated method stub
		pizza.setDough("Italian Dough");
		
	}

	@Override
	public void buildbase() {
		// TODO Auto-generated method stub
		pizza.setBase("Italian Base");
		
	}

	@Override
	public void buildtoppings() {
		// TODO Auto-generated method stub
		pizza.setToppings("Italian Toppings");
		
	}

	@Override
	public void buildsauce() {
		// TODO Auto-generated method stub
		pizza.setSauce("Italian Sauce");
		
	}

	@Override
	public void buildbake() {
		// TODO Auto-generated method stub
		pizza.setCheese("Bake");
	}

	@Override
	public void buildcheese() {
		// TODO Auto-generated method stub
		pizza.setCheese("Cheese");
	}

	@Override
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		Pizza final_pizza = this.pizza;
		this.pizza = new Pizza();
		return final_pizza;
	}

}
