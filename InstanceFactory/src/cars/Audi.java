package cars;

import interfaces.Car;

public class Audi implements Car {

	@Override
	public void drive() {
		System.out.println("Audi Car");
	}

}
