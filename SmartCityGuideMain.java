package projectSmartCity;

import java.util.Scanner;

public class SmartGuideMain {
	static Scanner sc=new Scanner(System.in);


		    public static void main(String[] args)
		    {
		    	System.out.println("       WELCOME TO THE SMART CITY GUIDE       ");
		    	System.out.println("                ***HYDERABAD***                ");
		    	String ch;
		        SmartGuideApp smartGuideApp = new SmartGuideApp();

		        do {
		        	System.out.println("\nSmart City Guide System");
		            System.out.println("1. Display Hotels");
		            System.out.println("2. Display Transport Options");
		            System.out.println("3. Display Shopping Options");
		            System.out.println("4. Display News");
		            System.out.println("5. Air Ticket Booking System");
		            
		            System.out.print("Enter your choice (1-5):\n ");
		            System.out.println(" ----------------------");


		            int choice=sc.nextInt();
		    		
		    		switch(choice)
		    		{
		    		
	                case 1:
	                    smartGuideApp.DisplayHotels();
	                    break;
	                case 2:
	                    smartGuideApp.DisplayTransportFacilities();
	                    break;
	                case 3:
	                    smartGuideApp.DisplayShoppingOptions();
	                    break;
	                case 4:
	                    smartGuideApp.DisplayNews();
	                    break;
	                case 5:
	                    smartGuideApp.DisplayAirTicketBooking();
	                    break;
	               
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
	            }
		    		
		    		System.out.println("Do you want to continue Using smart Guide? (Y-Yes / N-No)");
		   		 ch=sc.next();
		   		}
		   		while(ch.equals("Y")||ch.equals("y"));
		   		
		   		System.out.println("Thank you for using Smart Guide...");
		   	
		   		
		           
		}
		    }



