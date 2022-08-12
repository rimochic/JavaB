package encapsulation;

public class Movie {

	private String t;
	private String r;
	
	// Getter  method
	public String getTitle() {
		return t;
	}
	public String getRating() {
		return r;
	}
	
	// Setter method
	public void setTitle(String title) {
		this.t = title;
		
	}
	
	public void setRating (String rating) {
		if(rating == "6" || rating == "PG" || rating == "PG-13" || rating == "R") {
			this.r = rating;
		}
		else {
			this.r = "NR";
		}
	}
}
