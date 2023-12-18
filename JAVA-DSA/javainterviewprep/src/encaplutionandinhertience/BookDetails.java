package encaplutionandinhertience;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Create an object of the Book class
        Book book = new Book(0, null, null, 0);

        // Read inputs for the fields from the user
        System.out.print("Enter Book Number: ");
        int bookNo = scanner.nextInt();
        book.setBookNo(bookNo);

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        book.setAuthor(author);

        System.out.print("Enter Price: ");
        float price = scanner.nextFloat();
        book.setPrice(price);

        // Display the details of the book
        System.out.println("Book Details:");
        System.out.println("Book Number: " + book.getBookNo());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());

        scanner.close();
    }
}