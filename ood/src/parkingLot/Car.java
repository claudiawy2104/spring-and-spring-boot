package parkingLot;

public class Car extends Vehicle{

	@Override
	public int getSize() {
		return VehicleSize.Compact.getSize();
	}	
}
