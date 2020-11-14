import java.awt.*;

public interface GeneralVehicle extends Movable{

	double speedFactor();
	int getNrDoors();
	double getEnginePower();
	String getModelName();
	double getCurrentSpeed();
	Color getColor();
	Point getPosition();
	double getHeading();

	void setColor(Color color);
	void setPosition(Point position);
	void incrementSpeed(double amount);
	void decrementSpeed(double amount);

	void brake(double amount);

	void startEngine();
	void stopEngine();
}
