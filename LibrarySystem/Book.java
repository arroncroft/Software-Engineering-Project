import java.sql.*;

public class Book {
	private String isbn;
	private int id;
	private String year;
	private String title;
	private int count;
	private String[] authors;
	private String[] keywords;

	public static Book[] searchBooksByTitle(String query) {
		return null;
	}

	public static Book[] searchBooksByAuthor(String query) {
		return null;
	}

	public boolean isAvailable() {

		return false;
	}
}