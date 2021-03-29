package movie;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class Movie {
	
	
	@SerializedName("id")
	private String imdbId;
	
	private String title;
	
	@SerializedName("Year")
	private int releaseYear;
	
	
	private transient double rating;
	
	private String[] actors;
	
	
	
	public Movie() {
		super();
	}
	public Movie(String imdbId, String title, int releaseYear, double rating) {
		super();
		this.imdbId = imdbId;
		this.title = title;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}
	
	public String[] getActors() {
		return actors;
	}
	public void setActors(String[] actors) {
		this.actors = actors;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [imdbId=" + imdbId + ", title=" + title + ", releaseYear=" + releaseYear + ", rating=" + rating
				+ ", actors=" + Arrays.toString(actors) + "]";
	}

	
	
}