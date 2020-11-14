import java.util.Iterator;

public interface VehicleStorer<typeOfVehicles extends GeneralVehicle> {
	public void addVehicle(typeOfVehicles vehicle);
	public typeOfVehicles unloadVehicle();
	public Iterator<typeOfVehicles> getIterator();
	public int getNrOfVehicles();
}
