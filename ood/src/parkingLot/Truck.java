package parkingLot;

public class Truck extends Vehicle{

	@Override
	public int getSize() {
		return VehicleSize.Large.getSize();
	}

}
