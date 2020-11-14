import java.awt.*;

public class Saab95 implements Car{
	/**
	 * Represents whether the car has its turbo on or off.
	 */
	private boolean turboOn;
	private RoadVehicle carObject;

	/**
	 * Constructor for the Saab 95.
	 */
	public Saab95(){
		carObject = new RoadVehicle(this, 2, Color.RED, 125, "Saab95");

		turboOn = false;
	}

	/**
	 * Turns the turbo on.
	 */
	public void setTurboOn(){
		turboOn = true;
	}

	/**
	 * Turns the turbo off.
	 */
	public void setTurboOff(){
		turboOn = false;
	}

	/**
	 * Method which returns the speed factor of the car.
	 * @return the speed factor which determines how the car accelerates or decelerates.
	 */
	@Override
	public double speedFactor(){
		double turbo = 1;
		if(turboOn) turbo = 1.3;
		return carObject.getEnginePower() * 0.01 * turbo;
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

