package assignmentClassAndObject;

public class FlightDTO {

	private String flightName;
	private String flightNo;
	private short sets;
	private double ticketPrice;
	private  boolean departure;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public short getSets() {
		return sets;
	}
	public void setSets(short sets) {
		this.sets = sets;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public boolean isDeparture() {
		return departure;
	}
	public void setDeparture(boolean departure) {
		this.departure = departure;
	}
	
	
	
}
