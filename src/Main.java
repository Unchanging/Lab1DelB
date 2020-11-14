import java.awt.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
//
//		ArrayList<Car> listOfCars = new ArrayList<>();
//
//		for (int i = 0; i < 500; i++) {
//			Car tempCar = new Volvo240();
//			listOfCars.add(tempCar);
//		}
//
//		CarTransport transport = new CarTransport();
//
//		for (int i = 0; i < 5; i++) {
//			transport.addVehicle(listOfCars.get(i));
//		}
//
//		transport.addVehicle(new Saab95());
//
//		for (int i = 0; i < 6; i++) {
//			System.out.println(transport.unloadLastVehicle());
//		}


		Car volvo = new Volvo240();
		Saab95 saab = new Saab95();

		Truck scania = new Scania();
		Truck transport = new CarTransport();

		RepairShop<GeneralVehicle> workshop = new RepairShop(10);

		workshop.addVehicle(saab);



	}
}
