import java.util.Iterator;

public class RepairShop<typeOfVehicles extends GeneralVehicle> implements VehicleStorer<typeOfVehicles>{

	private VehicleStorage<typeOfVehicles> vehicleStorage;

	public RepairShop(int maxNrOfVehicles) {
		vehicleStorage = new VehicleStorage<>(maxNrOfVehicles);
	}

	public typeOfVehicles retrieveVehicle(String modelName){
		return vehicleStorage.retrieveVehicle(modelName);
	}

	@Override
	public void addVehicle(typeOfVehicles vehicle) {
		vehicleStorage.addVehicle(vehicle);
	}

	@Override
	public typeOfVehicles unloadVehicle() {
		return vehicleStorage.unloadFirstVehicle();
	}

	@Override
	public Iterator<typeOfVehicles> getIterator() {
		return vehicleStorage.getIterator();
	}

	@Override
	public int getNrOfVehicles() {
		return vehicleStorage.getNrOfVehicles();
	}
}
