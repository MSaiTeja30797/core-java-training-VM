package oopsconcept;

public class Bus implements IVehicle
{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Steering in Bus");

		
	}

	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println("Breaks applied in Bus");

		
	}

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("Accelarator applied in Bus");

		
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("Clutch applied in Bus");

		
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 4;
	}

}
