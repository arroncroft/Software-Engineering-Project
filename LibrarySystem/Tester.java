import java.util.ArrayList;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.SQLException;

public class Tester {

	public static void main(String[] args) {

		// Testing add members from associate
		Associate associate3 = new Associate("test3fn", "I", "test3ln",
				 "333 test Road Valdosta GA", "3333333333", "test3",
				 "test3pw");


		Member mem = associate3.createMember("Test4fn", "A", "Kimtest4", "444 Test  thing Nashville GA", "444444449", "testing4", "testingpasswgord4");
		//associate2.sendmembertoDB(mem);

		System.out.println("done");



//		 // Testing add members
//		 Member mem1 = new Member("Chloe", "A", "Kimble",
//				 "1500 N Patterson St Valdosta GA", "123456789",
//				 "cakimble", "password");
//
//		 Member mem2 = new Member("Arron", "T", "Croft",
//		 "123 Croft Rd Valdosta GA", "9998885555", "atcroft", "somepassword");
//
//		 Member mem3 = new Member("Dominique", "S", "Adkins",
//		 "555 Forest Rd Valdosta GA", "5552223333", "dsadkins",
//		 "diffpassword");
//
//		 Associate as1 = new Associate("Wesley", "I", "Cook",
//		 "111 New Lane Rd Valdosta GA", "4445557777", "wicook",
//		 "thispassword");
//
//		 Member mem4 = new Member("Blah", "X", "Blahblah",
//		 "675 Gritt Rd Valdosta GA", "2296869999", "blah", "blahpassword");
//		 System.out.println(mem4.toString());
//
//		 Member mem5 = new Member("Newbie", "C", "Newbern",
//		 "555 Newbie Rd Valdosta GA", "2296864444", "newbieiee",
//		 "newpassword"); System.out.println(mem5.toString());
//
//		 Member mem6 = new Member("Dennis", "A", "Vegas",
//		 "999 Dum Rd Valdosta GA", "229688814", "dennisvegas",
//		 "dennispassword"); System.out.println(mem6.toString());
//
//		 ArrayList<BookDetail> bookDetails = Search.searchBooksByTitle("");
//
//		 for(BookDetail bd : bookDetails) { System.out.println(bd.getTitle()); }


		// Test suspend member accounts
		//Member m = new Member(1);
		// Member m = mem1;
		// m.activateAccount();
		// System.out.println(m.isActive());

		Book book1 = new Book(1);
		//m.checkOut(book1);

		Book book2 = new Book(2);
		//m.checkOut(book2);

//		m.placeHold(new BookDetail("0307346617"));
//		Book book3 = new Book(3);
//		m.checkOut(book3);
/*
		Book book4 = new Book(11);
		m.checkOut(book4);

		Member m2 = new Member(2);
		m2.placeHold(new BookDetail("9781451697216"));
*/

		//Member m2 = new Member(2);
		//m2.placeHold(new BookDetail("9781451697216"));

		m.renewBook(book1);
		m.renewBook(book2);
	}

}
