package BuilderPatternPractice;

public class DriverClass {
	//consumer class
	public static void main(String[] args) {
		
		Cook cook = new ItalianCook();
		HeadChef headchef = new HeadChef(cook);
		headchef.makePizza();
		
		Pizza pizza = cook.getPizza();
		pizza.showPizza();
		
		cook = new MexicanCook();
		headchef = new HeadChef (cook);
		headchef.makePizza();
		
		pizza = cook.getPizza();
		pizza.showPizza();
		
		
	}

}
