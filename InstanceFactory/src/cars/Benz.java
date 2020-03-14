package cars;

import interfaces.Car;

public class Benz implements Car {

	@Override
	public void drive() {
		System.out.println("Benz Car");
	}
}
