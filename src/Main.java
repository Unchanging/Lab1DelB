public class Main {
	public static void main(String[] args) {

		Car volvo = new Volvo240();
		Saab95 saab = new Saab95();

		Saab95 saab1 = new Saab95();
		Saab95 saab2 = new Saab95();
		Saab95 saab3 = new Saab95();
		Saab95 saab4 = new Saab95();

		Scania scania = new Scania();

		LargeFerry<GeneralVehicle>largeFerry = new LargeFerry<>(4, 10);

		largeFerry.addUnit(0, saab1);
		largeFerry.addUnit(1, scania);

		System.out.println(largeFerry.unloadUnit(0));

	}
}
