package projectSmartCity;

public class Hotel {
	private String HotelName;
	private String HotelAddress;
	private Long HotelContact;
	private double Rating;
	public Hotel() 
	{
		super();
     }
	public Hotel(String HotelName, String HotelAddress,Long HotelContact, double Rating) {
		super();
		this.HotelName = HotelName;
		this. HotelAddress=HotelAddress ;
		this. HotelContact= HotelContact;
		this. Rating= Rating;
		
	}
	public String getHotelName()
	{
		return HotelName;
	}
	
	public void setHotelName(String hotelName)
	{
		HotelName = hotelName;
	}
	
	public String getHotelAddress()
	{
		return HotelAddress;
	}
	
	public void setHotelAddress(String hotelAddress)
	{
		HotelAddress = hotelAddress;
	}
	
	public Long getHotelContact()   
	{
		return HotelContact;
	}
	
	public void setHotelContact(Long hotelContact)
	{
		HotelContact = hotelContact;
	}
	
	public double getRating()
	{
		return Rating;
	}
	
	public void setRating(double rating)
	{
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", HotelAddress=" + HotelAddress + ", HotelContact=" + HotelContact
				+ ", Rating=" + Rating + "]";
	}
}