package encapsulation;

public class TestMovie {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.setTitle("Avengers");
		movie.setRating("G");
		
		System.out.println(movie.getTitle());
		System.out.println(movie.getRating());

	}

}
