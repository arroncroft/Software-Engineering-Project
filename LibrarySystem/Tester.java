public class Tester {

	public static void main(String[] args) {

		//ArrayList<BookDetail> bookDetails = Search.searchBooksByTitle("");
		/*
				Manager manager = new Manager(1);
				manager.createManager("Arron", "T", "Croft", "111 Test Drive, Valdosta, GA 31602",
						"2295551234", "atcroft", "mypassword");
				manager.createAssociate("Wesley", "I", "Cook", "1313 Test Drive, Valdosta, GA 31602",
						"2295554321", "wicook", "wesleypassword");
				manager.createMember("Chloe", "A", "Kimble", "1234 Test Drive, Nashville, GA 31639",
						"2295550000", "cakimble", "testpass");
				Associate associate = new Associate(4);
				associate.createMember("Dustin", null, "Geoghagan", "000 Null Drive, Valdosta, GA",
						"1234567890", "dgeoghagan", "passpass");

				Member m1 = new Member("atcroft");
				Book book2 = new Book(2);
				m1.checkOut(book2);

				//Does not have permission to create associate as an associate
				Member m2 = new Manager("wicook");
				((Manager)m2).createAssociate("Testman", null, "Testerson", "000 Null Drive, Valdosta, GA",
						"0123987654", "testy", "tests");
		*/


		Member chloe = new Member("cakimble");
		Book book3 = new Book(3);
		chloe.checkOut(book3);


	}
}
