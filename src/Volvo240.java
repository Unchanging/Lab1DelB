import java.awt.*;

public class Volvo240 implements Car{
	/**
	 * Represents the trim factor of the car. This factor is used to determine the speed factor for a volvo.
	 */
	public final static double trimFactor = 1.25;
	private RoadVehicle carObject;

	/**
	 * Constructor for a Volvo 240.
	 */
	public Volvo240() {
		carObject = new RoadVehicle(this, 4, Color.BLACK, 100, "Volvo240");

	}

	/**
	 * Method which returns the speed factor of the car.
	 * @return the speed factor which determines how the car accelerates or decelerates.
	 */
	public double speedFactor() {
		return carObject.getEnginePower() * 0.01 * trimFactor;
	}

	@Override
	public int getNrDoors() {
		return carObject.getNrDoors();
	}

	@Override
	public double getEnginePower() {
		return carObject.getEnginePower();
	}

	@Override
	public String getModelName() {
		return carObject.getModelName();
	}

	@Override
	public double getCurrentSpeed() {
		return carObject.getCurrentSpeed();
	}

	@Override
	public Color getColor() {
		return carObject.getColor();
	}

	@Override
	public Point getPosition() {
		return carObject.getPosition();
	}

	@Override
	public double getHeading() {
		return carObject.getHeading();
	}

	@Override
	public void setColor(Color color) {
		carObject.setColor(color);
	}

	@Override
	public void setPosition(Point position) {
		carObject.setPosition(position);
	}

	@Override
	public void incrementSpeed(double amount) {
		carObject.incrementSpeed(amount);
	}

	@Override
	public void decrementSpeed(double amount) {
		carObject.decrementSpeed(amount);
	}

	@Override
	public void gas(double amount) {
		carObject.gas(amount);
	}

	@Override
	public void brake(double amount) {
		carObject.brake(amount);
	}

	@Override
	public void startEngine() {
		carObject.startEngine();
	}

	@Override
	public void stopEngine() {
		carObject.stopEngine();
	}

	@Override
	public void move() {
		carObject.move();
	}

	@Override
	public void turnLeft() {
		carObject.turnLeft();
	}

	@Override
	public void turnRight() {
		carObject.turnRight();
	}

	@Override
	public String toString() {
		return carObject.toString();
	}
}
