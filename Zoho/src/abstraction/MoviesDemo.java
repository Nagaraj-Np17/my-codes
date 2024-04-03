package abstraction;
abstract class Movies{
	 protected String moviesName;
	 protected String director;
	 protected int year;
	
	
public Movies(String moviesName, String director, int year) {
		super();
		this.moviesName = moviesName;
		this.director = director;
		this.year = year;
	}

abstract void printMoviesInfo();
abstract String genre();
	
}
class LoveMovies extends Movies{
	private String genre=genre();
	public LoveMovies(String moviesName, String director, int year) {
		super(moviesName, director, year);
		
	}
	@Override
	public String genre() {		
		return "Love";
	}
	@Override
	void printMoviesInfo() {
		System.err.println("|----  Love Movies   -----|");
			 System.out.println("MovieName  - "+moviesName+"	|	"+" Director  -  "+director+ "Year  - "+year+"	|	"
		 		+ ""+"Director  - "+director+"	|	"+"Genre -  "+genre());
		
	}
	
}
class ComedyMovies extends Movies{
	
	private String mainComedyActor;
	public ComedyMovies(String moviesName, String director, int year,String mainComedyActor) {
		super(moviesName, director, year);
		this.mainComedyActor=mainComedyActor;
	}
	@Override
	public String genre() {		
		return "Comedy";
	}
	@Override
	void printMoviesInfo() {
		System.err.println("|----  Comedy Movies   -----|");
		 System.out.println("MovieName -  "+moviesName+"	|	"+"Director - "+director+ "Year - "+year+"	|	"
	 		+ ""+"Director - "+director+"	|	"+"Genre - "+genre()+"ComedyLead - "+mainComedyActor);
	
}
	
}
  
public class MoviesDemo {

public static void main(String[] args) {
	Movies movies;
	movies=new LoveMovies("love","npr",2024);
	movies.printMoviesInfo();
	movies=new ComedyMovies("Hangover","npr",2021,"Allen");
	movies.printMoviesInfo();
}

}
