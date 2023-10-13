package projectSmartCity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class SmartGuideApp 
{
	String ch;
	static Scanner sc = new Scanner(System.in);
	  //Hotel
	public void DisplayHotels() {
    ArrayList<Hotel> HotelList = new ArrayList<Hotel>();
    {
        HotelList.add(new Hotel("Taj Krishna", "Banjara Hills", 9876543210L, 4.5));
        HotelList.add(new Hotel("Marriott Hotel", "Hitech city", 9010203040L, 4.3));
        HotelList.add(new Hotel("Hyatt palace", "Banjara Hills", 8798776541L, 4.2));
        HotelList.add(new Hotel("Novotel", "GachiBowli", 8566774433L, 4.0));
        HotelList.add(new Hotel("ITC Kohenur", "Hitech City", 8591764455L, 4.7));
    }
    
    
    {
       for (Hotel hotel : HotelList) 
        {
    	   System.out.println("Hotel Name: " + hotel.getHotelName());
    	   System.out.println("Location: " + hotel.getHotelAddress());
    	   System.out.println("Contact: " + hotel.getHotelContact());
    	   System.out.println("Rating: " + hotel.getRating());
    	   System.out.println(" ----------------------");
         }
    }
     }
    //Transport
    public void DisplayTransportFacilities()
    {
    ArrayList<Transport> TransportList = new ArrayList<>();
    {
    	TransportList.add(new Transport("Bus", "Whole Hyderabad", 50));
    	TransportList.add(new Transport("Metro", "Nagole-raidurg,Miyapur-L.B nagar", 1000));
    	TransportList.add(new Transport("Cab", "On-demand service", 4));

    	for (Transport transport : TransportList)
    	 {
    		System.out.println("Transport Mode: " + transport.getTransportMode());
    		System.out.println("Transport Details: " + transport.getTransportDetails());
    		System.out.println("Vehicle Capacity: " + transport.getVehicleCapacity());
    		System.out.println(" ----------------------");
          }
    }
    }

    //AirTicketBooking
    
    public void DisplayAirTicketBooking()
    {
        
        AirTicketBooking ticket = new AirTicketBooking("AirIndia", "Begumpet", "AP-Mumbai-Banglore", 80);

        do {
            System.out.println("\nAir Ticket Booking System");
            System.out.println("1. Book Seats");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Check Seat Availability");
            System.out.println("4. Display Booking Details");
            System.out.print("Enter your choice (1-4): \n");
            System.out.println(" ----------------------");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of seats to book: ");
                    int numSeatsToBook = sc.nextInt();
                    ticket.bookSeats(numSeatsToBook);
                    break;
                case 2:
                    System.out.print("Enter the number of seats to cancel: ");
                    int numSeatsToCancel = sc.nextInt();
                    ticket.cancelReservation(numSeatsToCancel);
                    break;
                case 3:
                    boolean isAvailable = ticket.checkSeatAvailability();
                    System.out.println("Seats are " + (isAvailable ? "available" : "not available"));
                    break;
                case 4:
                    ticket.displayBookingDetails();
                    break;
                
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    
            }
            System.out.println("Do you want to continue? (Y-Yes / N-No)");
	   		 ch=sc.next();
	   		}
	   		while(ch.equals("Y")||ch.equals("y"));
	   		
	   		System.out.println("Thank you!");
	   	
	   	
        }
    
 //Shopping
    public void DisplayShoppingOptions() 
    {
        ArrayList<Shopping> shoppingList = new ArrayList<>();
        {
        	shoppingList.add(new Shopping ("pantaloons","Kothapet","Clothing"));
        	shoppingList.add(new Shopping ("D-Mart","Champapet","Household items"));
        	shoppingList.add(new Shopping ("Laad Bazar","Charminar","Bangles"));
        	shoppingList.add(new Shopping ("Begum Bazar","Koti","Accessories"));
        	shoppingList.add(new Shopping ("Reliance","Hasthinapuram","Electronics"));
        	

        	for (Shopping shopping : shoppingList) {
                System.out.println("Shop Name: " + shopping.getShopName());
                System.out.println("Location: " + shopping.getLocation());
                System.out.println("Category: " + shopping.getCategory());
                System.out.println(" ----------------------");
            }
        }
    }
   //News
    public void DisplayNews()
    {
        ArrayList<News> NewsList = new ArrayList<>(); {      
        	NewsList.add (new News("Breaking News", "A major event has occurred.", new Date()));
        	NewsList.add(new News("Weather Update", "Expect sunny weather tomorrow.", new Date()));
        	NewsList.add(new News("Tech News", "New technology breakthrough announced.", new Date()));
        	NewsList.add( new News("Sports", "India Won the world cup.", new Date()));
        	NewsList.add(new News("Business news", "The twitter logo has changed", new Date()));

for (News News : NewsList)
{
    System.out.println( News.getHeadline());
    System.out.println(  News.getContent());
    System.out.println( News.getDate());
    System.out.println(" ----------------------");
}
  }
}
}
