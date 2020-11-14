import java.awt.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class VehicleStorage<typeOfVehicles extends GeneralVehicle> {

	private LinkedList<typeOfVehicles> listOfVehicles;
	private int maxNrOfVehicles;

	public VehicleStorage(int maxNrOfVehicles) {
		this.maxNrOfVehicles = maxNrOfVehicles;
		listOfVehicles = new LinkedList<typeOfVehicles>();
	}

	public void addVehicle(typeOfVehicles vehicle) {
		if (listOfVehicles.size() < maxNrOfVehicles)
			listOfVehicles.add(vehicle);
		else
			throw new RuntimeException("The vehicle storage is full and can not add another vehicle");
	}

	public typeOfVehicles unloadLastVehicle(){
		typeOfVehicles vehicle = listOfVehicles.getLast();
		listOfVehicles.remove(vehicle);
		return vehicle;
	}

	public typeOfVehicles unloadFirstVehicle(){
		typeOfVehicles vehicle = listOfVehicles.getFirst();
		listOfVehicles.remove(vehicle);
		return vehicle;
	}

	public typeOfVehicles retrieveVehicle(String modelName) {
		typeOfVehicles foundVehicle = null;
		for(typeOfVehicles vehicle : listOfVehicles) {
			if (vehicle.getModelName().equals(modelName))
				foundVehicle = vehicle;
		}
		listOfVehicles.remove(foundVehicle);
		return foundVehicle;
	}

	public void updatePositions(Point newPosition) {
		for (typeOfVehicles vehicle : listOfVehicles) {
			vehicle.setPosition(newPosition);
		}
	}

	public Iterator<typeOfVehicles> getIterator() {
		return Collections.unmodifiableList(listOfVehicles).iterator();
	}

	public int getNrOfVehicles() {
		return listOfVehicles.size();
	}
}
