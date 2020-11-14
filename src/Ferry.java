import java.util.Iterator;

public class Ferry implements Movable, VehicleStorer<GeneralVehicle>{

	private VehicleStorage<GeneralVehicle> vehicleStorage;

	public Ferry() {
		vehicleStorage = new VehicleStorage<>(30);
	}

	@Override
	public void move() {

	}

	@Override
	public void turnLeft() {

	}

	@Override
	public void turnRight() {

	}

	@Override
	public void addVehicle(GeneralVehicle vehicle) {

	}

	@Override
	public GeneralVehicle unloadVehicle() {
		return null;
	}

	@Override
	public Iterator<GeneralVehicle> getIterator() {
		return null;
	}

	@Override
	public int getNrOfVehicles() {
		return 0;
	}
}
