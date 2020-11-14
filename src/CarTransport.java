import java.awt.*;
import java.util.Collections;
import java.util.Iterator;

public class CarTransport implements Truck, VehicleStorer<Car>{

	private RoadVehicle truckObject;
	private boolean rampIsDown;
	private VehicleStorage<Car> vehicleStorage;

	public CarTransport() {
		truckObject = new RoadVehicle(this, 2, Color.RED, 90, "Iveco");
		rampIsDown = false;
		vehicleStorage = new VehicleStorage<>(6);
	}

	public double speedFactor() {
		return truckObject.getEnginePower() * 0.004;
	}

	public void raiseRamp() {
		rampIsDown = false;
	}

	public void lowerRamp() throws RuntimeException{
		if (getCurrentSpeed() > 0)
			throw new RuntimeException("Ramp can not be lowered while transport is moving.");
		rampIsDown = true;
	}

	public void addVehicle(Car vehicle) {

		if (!rampIsDown)
			throw new RuntimeException("Cars can not be loaded while the ramp is not lowered.");
		if (getPosition().distance(vehicle.getPosition()) > 10)
			throw new RuntimeException("The car is too far away from the transport to be loaded. Max distance is 10 units");
		vehicleStorage.addVehicle(vehicle);

	}

	public Car unloadVehicle() {
		if (rampIsDown) {
			Car tempCar = vehicleStorage.unloadLastVehicle();
			Point tempPosition = getPosition();
			tempPosition.translate(5, 5);
			tempCar.setPosition(tempPosition);
			return tempCar;
		}
		else
			throw new RuntimeException("Cars can not be unloaded while the ramp is not lowered");
	}

	public Iterator<Car> getIterator() {
		return vehicleStorage.getIterator();
	}

	public int getNrOfVehicles() {
		return vehicleStorage.getNrOfVehicles();
	}

	@Override
	public void incrementSpeed(double amount) throws RuntimeException{
		if (rampIsDown)
			throw new RuntimeException("The vehicle can not accelerate when the ramp is lowered");
		truckObject.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
	}

	@Override
	public void move() {
		truckObject.move();
		vehicleStorage.updatePositions(this.getPosition());
	}

	@Override
	public int getNrDoors() {
		return truckObject.getNrDoors();
	}

	@Override
	public double getEnginePower() {
		return truckObject.getEnginePower();
	}

	@Override
	public String getModelName() {
		return truckObject.getModelName();
	}

	@Override
	public double getCurrentSpeed() {
		return truckObject.getCurrentSpeed();
	}

	@Override
	public Color getColor() {
		return truckObject.getColor();
	}

	@Override
	public void setPosition(Point position) {
		truckObject.setPosition(position);
	}

	@Override
	public Point getPosition() {
		return truckObject.getPosition();
	}

	@Override
	public double getHeading() {
		return truckObject.getHeading();
	}

	@Override
	public void setColor(Color color) {
		truckObject.setColor(color);
	}

	@Override
	public void decrementSpeed(double amount) {
		truckObject.decrementSpeed(amount);
	}

	@Override
	public void gas(double amount) {
		truckObject.gas(amount);
	}

	@Override
	public void brake(double amount) {
		truckObject.brake(amount);
	}

	@Override
	public void startEngine() {
		truckObject.startEngine();
	}

	@Override
	public void stopEngine() {
		truckObject.stopEngine();
	}

	@Override
	public void turnLeft() {
		truckObject.turnLeft();
	}

	@Override
	public void turnRight() {
		truckObject.turnRight();
	}

	@Override
	public String toString() {
		return truckObject.toString();
	}
}
