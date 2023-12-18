package encaplutionandinhertience;

import java.util.Scanner;

public class EngineeringBookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the EngineeringBook class
        EngineeringBook engineeringBook = new EngineeringBook(0, null, null, 0);

        System.out.print("Enter Book Number: ");
        int bookNo = scanner.nextInt();
        scanner.nextLine();
        engineeringBook.setBookNo(bookNo);

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        engineeringBook.setTitle(title);

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        engineeringBook.setAuthor(author);

        System.out.print("Enter Price: ");
        float price = scanner.nextFloat();
        engineeringBook.setPrice(price);

        System.out.print("Enter Category: ");
        String category = scanner.next();
        engineeringBook.setCategory(category);

        // Display engineering book details
        System.out.println("Engineering Book Details:");
        System.out.println("Book Number: " + engineeringBook.getBookNo());
        System.out.println("Title: " + engineeringBook.getTitle());
        System.out.println("Author: " + engineeringBook.getAuthor());
        System.out.println("Price: " + engineeringBook.getPrice());
        System.out.println("Category: " + engineeringBook.getCategory());

        scanner.close();
    }
}
