import java.awt.*;

public class Scania implements Truck{
	private RoadVehicle truckObject;
	private double platformAngle;

	public Scania() {
		truckObject = new RoadVehicle(this, 2, Color.GRAY, 100, "Scania");
		platformAngle = 0;
	}

	public void raisePlatform(double degreesIncrease) throws RuntimeException{
		if (getCurrentSpeed() != 0)
			throw new RuntimeException("The platform can not be raised while the vehicle is moving");
		platformAngle += degreesIncrease;
		if (platformAngle > 70)
			platformAngle = 70;
	}

	public void lowerPlatform(double degreesDecrease) {
		platformAngle -= degreesDecrease;
		if (platformAngle < 0)
			platformAngle = 0;
	}

	public double getPlatformAngle() {
		return platformAngle;
	}

	public double speedFactor() {
		return truckObject.getEnginePower() * 0.005;
	}

	@Override
	public void incrementSpeed(double amount) throws RuntimeException{
		if (platformAngle > 0)
			throw new RuntimeException("The vehicle can not accelerate when the platform is raised");
		truckObject.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
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
	public void move() {
		truckObject.move();
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
