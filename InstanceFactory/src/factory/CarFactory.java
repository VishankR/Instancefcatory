package factory;

import interfaces.Car;

public class CarFactory {
	private String carName;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Car getCar()throws Exception{
		return (Car)Class.forName("cars."+carName).newInstance();
	}
}
