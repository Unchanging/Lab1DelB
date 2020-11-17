import java.awt.*;

public interface GeneralVehicle extends Movable, Transportable{

	double speedFactor();
	double getEnginePower();
	String getModelName();
	double getCurrentSpeed();
	Color getColor();
	Point getPosition();
	double getHeading();

	void setColor(Color color);
	void setPosition(Point position);
	void gas(double amount);
	void incrementSpeed(double amount);
	void decrementSpeed(double amount);

	void brake(double amount);

	void startEngine();
	void stopEngine();

	default String getIdentifier() {
		return getModelName();
	}
}
