package assignmentPolymorphism;

public class MovieDemo {
		public static void main(String[] args) {
			Movie movie1 = new RomComMovie("RomeoJuliet", 2023);
			Movie movie2 = new ThrillerMovie("kanchana", 2011);
			Movie movie3 = new ActionMovie("Fast&Furius10", 2023);

			printMovieDetails(movie1);
			printMovieDetails(movie2);
			printMovieDetails(movie3);
		}

		public static void printMovieDetails(Movie movie) {
			System.out.println("Movie Title: " + movie.getTitle());
			System.out.println("Release Year: " + movie.getReleaseYear());
			System.out.println("Genre: " + movie.getGenre());
			System.out.println();
		}
	}

	class Movie {
		private String title;
		private int releaseYear;

		public Movie(String title, int releaseYear) {
			this.title = title;
			this.releaseYear = releaseYear;
		}

		public String getTitle() {
			return title;
		}

		public int getReleaseYear() {
			return releaseYear;
		}

		public String getGenre() {
			return "Generic";
		}
	}

	class RomComMovie extends Movie {
		public RomComMovie(String title, int releaseYear) {
			super(title, releaseYear);
		}

		@Override
		public String getGenre() {
			return "Romantic Comedy";
		}
	}

	class ThrillerMovie extends Movie {
		public ThrillerMovie(String title, int releaseYear) {
			super(title, releaseYear);
		}

		@Override
		public String getGenre() {
			return "Thriller";
		}
	}

	class ActionMovie extends Movie {
		public ActionMovie(String title, int releaseYear) {
			super(title, releaseYear);
		}

		@Override
		public String getGenre() {
			return "Action";
		}
	}

