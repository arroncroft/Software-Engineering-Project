import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) {

////
//		Member m1 = new Member("atcroft");
//		Copy book2 = new Copy(2);
//		m1.checkOut(book2);

//		// Does not have permission to create associate as an associate
//		Member m1 = new Manager("wicook");
//		((Manager)m1).createAssociate("Testman", null, "Testerson", "000 Null Drive, Valdosta, GA",
//				"0123987654", "testy", "tests");

//		Manager man = new Manager("atcroft");
//		man.addCopy("0060853980");
//		man.addBook("9780060873172", "Micro", "2012",
//				new String[]{"Michael Crichton","Richard Preston"},
//				new String[]{"Fiction","Adventure","Thriller"}, 4);
//		man.deleteBook(new Book("0060853980"));

		Member chloe = new Member("cakimble");
		Copy book3 = new Copy(3);
		chloe.checkOut(book3);
	}
}
