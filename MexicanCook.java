package BuilderPatternPractice;

public class MexicanCook implements Cook {
	
	private Pizza pizza;
	
	public MexicanCook() {
		this.pizza = new Pizza();
	}

	@Override
	public void builddough() {
		// TODO Auto-generated method stub
		pizza.setDough("Mexican dough");
	}

	@Override
	public void buildbase() {
		// TODO Auto-generated method stub
		pizza.setBase("Mexican Base");
	}

	@Override
	public void buildtoppings() {
		// TODO Auto-generated method stub
		pizza.setToppings("Mexican Toppings");
	}

	@Override
	public void buildsauce() {
		// TODO Auto-generated method stub
		pizza.setSauce("Mexican Sauce");
	}

	@Override
	public void buildbake() {
		// TODO Auto-generated method stub
		pizza.setBake("Bake");
		
	}

	@Override
	public void buildcheese() {
		// TODO Auto-generated method stub
		pizza.setCheese("cheese");
		
	}

	@Override
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		Pizza final_pizza = this.pizza;
		this.pizza = new Pizza();
		return final_pizza;
	}

}
