package assignmentClassAndObject;

import java.util.Date;

public class MovieDTO {

	private String title;
	private String derector;
	private Date releaseDate;
	private double Budget;
	private String duration;
	private boolean ottRealeaseAvailable;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDerector() {
		return derector;
	}
	public void setDerector(String derector) {
		this.derector = derector;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getBudget() {
		return Budget;
	}
	public void setBudget(double budget) {
		Budget = budget;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public boolean isOttRealeaseAvailable() {
		return ottRealeaseAvailable;
	}
	public void setOttRealeaseAvailable(boolean ottRealeaseAvailable) {
		this.ottRealeaseAvailable = ottRealeaseAvailable;
	}
	
}
