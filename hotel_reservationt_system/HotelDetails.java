package hotel_reservationt_system;

/* A hotel chain operating in Miami wishes to offer room reservation services over the internet. 
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
public class HotelDetails {

	private String hotelName;
	private int regularCustomerWeekdayRates;
	private int regularCustomerWeekEndRates;
	private double rateing;
	private int rewardCustomerWeekdayRates;
	private int rewardCustomerWeekEndRates;

	@Override
	public String toString() {
		return "HotelDetails [hotelName=" + hotelName + ", regularCustomerWeekdayRates=" + regularCustomerWeekdayRates
				+ ", regularCustomerWeekEndRates=" + regularCustomerWeekEndRates + ", rateing=" + rateing
				+ ", rewardCustomerWeekdayRates=" + rewardCustomerWeekdayRates + ", rewardCustomerWeekEndRates="
				+ rewardCustomerWeekEndRates + "]";
	}

	public HotelDetails(String hotelName, int regularCustomerWeekdayRates, int regularCustomerWeekEndRates,
			double rateing, int rewardCustomerWeekdayRates, int rewardCustomerWeekEndRates) {

		this.hotelName = hotelName;
		this.regularCustomerWeekdayRates = regularCustomerWeekdayRates;
		this.regularCustomerWeekEndRates = regularCustomerWeekEndRates;
		this.rateing = rateing;
		this.rewardCustomerWeekdayRates = rewardCustomerWeekdayRates;
		this.rewardCustomerWeekEndRates = rewardCustomerWeekEndRates;
	}

	public int getRegularCustomerWeekdayRates() {
		return regularCustomerWeekdayRates;
	}

	public void setRegularCustomerWeekdayRates(int regularCustomerWeekdayRates) {
		this.regularCustomerWeekdayRates = regularCustomerWeekdayRates;
	}

	public int getRegularCustomerWeekEndRates() {
		return regularCustomerWeekEndRates;
	}

	public void setRegularCustomerWeekEndRates(int regularCustomerWeekEndRates) {
		this.regularCustomerWeekEndRates = regularCustomerWeekEndRates;
	}

	public int getRewardCustomerWeekdayRates() {
		return rewardCustomerWeekdayRates;
	}

	public void setRewardCustomerWeekdayRates(int rewardCustomerWeekdayRates) {
		this.rewardCustomerWeekdayRates = rewardCustomerWeekdayRates;
	}

	public int getRewardCustomerWeekEndRates() {
		return rewardCustomerWeekEndRates;
	}

	public void setRewardCustomerWeekEndRates(int rewardCustomerWeekEndRates) {
		this.rewardCustomerWeekEndRates = rewardCustomerWeekEndRates;
	}

}
