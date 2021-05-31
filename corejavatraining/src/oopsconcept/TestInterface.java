package oopsconcept;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IVehicle vehicle=new Bus();
		
		vehicle.accelarator();
		vehicle.breaks();
		vehicle.clutches();
		System.out.println(vehicle.gears());
		vehicle.steering();

	}

}
