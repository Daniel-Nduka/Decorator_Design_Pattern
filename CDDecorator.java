//concrete decorator class
package Lab3_2;


public class CDDecorator extends CarDecorator {
	
	public CDDecorator(Car c) {
		super(c);
	}
	
	public Double getPrice() {
	
		return decoratedCar.getPrice() + 150;
	}
	
	public String getDescription() {
		return decoratedCar.getDescription() + " CD";
	}
}
