package projectSmartCity;

public class AirTicketBooking
{
	private String FlightName;
    private String DepartureCity;
    private String DestinationCity;
    private int AvailableSeats;

    public AirTicketBooking()
    {
        super();
     }
    public AirTicketBooking(String FlightName , String DepartureCity, String DestinationCity , int AvailableSeats ) 
    {
    	super();
        this. FlightName= FlightName;
        this. DepartureCity= DepartureCity;
        this. DestinationCity= DestinationCity;
        this.AvailableSeats = AvailableSeats;
    }
    public String getFlightname() {
		return FlightName;
	}
	public void setFlightNumber(String flightName) {
		FlightName = flightName;
	}
	public String getDepartureCity() {
		return DepartureCity;
	}
	public void setDepartureCity(String departureCity) {
		DepartureCity = departureCity;
	}
	public String getDestinationCity() {
		return DestinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		DestinationCity = destinationCity;
	}
	public int getAvailableSeats() {
		return AvailableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		AvailableSeats = availableSeats;
	}
	
	public void bookSeats(int numSeats) {
        if (numSeats > 0 && numSeats <= AvailableSeats) {
            AvailableSeats -= numSeats;
            System.out.println("Seats booked successfully!");
        } else {
            System.out.println("Not enough available seats.");
        }
    }

    public void cancelReservation(int numSeats) {
        if (numSeats > 0) {
            AvailableSeats += numSeats;
            System.out.println("Reservation canceled successfully!");
        } else {
            System.out.println("Invalid number of seats to cancel.");
        }
    }

    public boolean checkSeatAvailability() {
        return AvailableSeats > 0;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Flight Name: " + FlightName);
        System.out.println("Departure City: " + DepartureCity);
        System.out.println("Destination City: " + DestinationCity);
        System.out.println("Available Seats: " + AvailableSeats);
    }
	@Override
	public String toString() 
	{
		return "AirTicketBooking [FlightNamer=" + FlightName + ", DepartureCity=" + DepartureCity
				+ ", DestinationCity=" + DestinationCity + ", AvailableSeats=" + AvailableSeats + "]";
	}

    
}
   
