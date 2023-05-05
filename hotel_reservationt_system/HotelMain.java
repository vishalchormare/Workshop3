package hotel_reservationt_system;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * A hotel chain operating in Miami wishes to offer room reservation services over the internet. 
 * They have three hotels in Miami: Lakewood, Bridgewood and Ridgewood. Each hotel has separate
weekday and weekend (Saturday and Sunday) rates. There are special rates for rewards customer 
as a part of loyalty program. Each hotel has a rating assigned to it.
Lakewood with a rating of 3 has weekday rates as 110$ for regular customer and 80$ for rewards
customer. The weekend rates are 90 for regular customer and 80 for a rewards customer.
Bridgewood with a rating of 4 has weekday rates as 160$ for regular customer and 110$ for
rewards customer. The weekend rates are 60 for regular customer and 50 for a rewards customer.
Ridgewood with a rating of 5 has weekday rates as 220$ for regular customer and 100$ for rewards
customer. The weekend rates are 150 for regular customer and 40 for a rewards customer.
Can you write a program to help an online customer find the cheapest hotel?
 */

/*
 * System.out.println("Enter the startdate : ");
        LocalDate startDate = LocalDate.parse(sc.nextLine(), 
        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the enddate : ");
        LocalDate endDate = LocalDate.parse(sc.nextLine(), 
        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
DayOfWeek date1= startDate.getDayOfWeek();
 */

public class HotelMain {

//	static long getWeekends(String strStartDate, String strEndDate) {
//		return 0;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		HotelDetails lakewood = new HotelDetails("Lakewood", 110, 90, 3, 80, 80);
		HotelDetails bridgewood = new HotelDetails("Bridgewood", 160, 60, 4, 110, 50);
		HotelDetails ridgewood = new HotelDetails("Ridgewood", 220, 150, 5, 100, 40);

		List<HotelDetails> hotelList = new ArrayList<HotelDetails>();

		hotelList.add(lakewood);
		hotelList.add(bridgewood);
		hotelList.add(ridgewood);

		System.out.println("Hotels are :");
		hotelList.forEach(x -> System.out.println(x));
		
		String customerType="Regular";
		
		if(customerType.toLowerCase()=="regular"||customerType.toUpperCase()=="Regular") {
			System.out.println("Enter the startdate : ");
			LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			System.out.println("Enter the enddate : ");
			LocalDate endDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			DayOfWeek date1= startDate.getDayOfWeek();
		}else {
		
			//RewardCustomer
		}
		
		
	}

}
