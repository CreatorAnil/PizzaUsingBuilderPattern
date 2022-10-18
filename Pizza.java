package BuilderPatternPractice;

public class Pizza {
	private String dough;
	private String base;
	private String toppings;
	private String sauce;
	private String bake;
	private String cheese;
	
	public void setDough(String dough) {
		this.dough = dough;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setBake(String bake) {
		this.bake = bake;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	public void showPizza() {
		System.out.println(dough+", "+base+", "+toppings+", "+sauce+", "+bake+", "+cheese);
	}
	

}
