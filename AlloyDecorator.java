//concrete decorator class
package Lab3_2;



public class AlloyDecorator extends CarDecorator {
	
	
	public AlloyDecorator(Car c) {
		super(c);
	}
	
	public Double getPrice() {
		return decoratedCar.getPrice() + 250;
	}
	
	public String getDescription() {
		return decoratedCar.getDescription() + " Alloy";
	}
}
