package projectSmartCity;

public class Transport {
	
	
	private String TransportMode;
	private String TransportDetails;
	private int VehicleCapacity;
	public Transport()
	{
		super();
	}
	public Transport(String TransportMode, String TransportDetails, int VehicleCapacity)
	{
		super();
		this.TransportMode=TransportMode;
		this. TransportDetails=TransportDetails;
		this. VehicleCapacity=VehicleCapacity;
	
	}
	public String getTransportMode() 
	{
		return TransportMode;
	}
	public void setTransportMode(String transportMode) 
	{
		TransportMode = transportMode;
	}
	public String getTransportDetails() 
	{
		return TransportDetails;
	}
	public void setTransportDetails(String transportDetails)
	{
		TransportDetails = transportDetails;
	}
	public int getVehicleCapacity()
	{
		return VehicleCapacity;
	}
	public void setVehicleCapacity(int vehicleCapacity)
	{
		VehicleCapacity = vehicleCapacity;
	}
	
	@Override
	public String toString() {
		return "Transport [TransportMode=" + TransportMode + ", TransportDetails=" + TransportDetails
				+ ", VehicleCapacity=" + VehicleCapacity + "]";
	}
	
	
}
