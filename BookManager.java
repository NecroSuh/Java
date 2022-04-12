package bookmanager;

import java.util.Scanner;

public class BookManager {
	public static void main(String[] args) {
		/*
		 * Book book = new Book("Java", "Tom", "2021.09.02", 17000);
		 * 
		 * book.printInfo();
		 * 
		 * Book book2 = new Book();
		 * book2.setTitle("Web Design").setAuthor("Jerry").setBuyDate("2021.10.12").
		 * setPrice(15000).printInfo(); System.out.println(book2);
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("***** Book Manager *****");
		System.out.print("Box size : ");
		int size = scan.nextInt();
		BookBox mybox = new BookBox(size);

		while (true) {
			System.out.print("Book Title(quit to exit) : ");
			String title = scan.next();
			if (title.equals("quit"))
				break;	// 문자열 동등비교. == 안됨. == =>주소 비교
			System.out.print("Book Author : ");
			String author = scan.next();	
			System.out.print("Book Buydate : ");
			String date = scan.next();
			System.out.print("Book Price : ");
			int price = scan.nextInt();
			Book book = new Book(title,author,date,price);
			mybox.add(book);
			mybox.add(title,author,date,price);
		}
		mybox.get(0).printInfo();
	}
}
