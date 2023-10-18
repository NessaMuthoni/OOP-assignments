package book;

import java.util.Scanner;

public class BookInputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Book myBook = new Book();

        
        System.out.print("Please enter the title of the book:\n ");
        myBook.title = scanner.nextLine();

        System.out.print("Please enter the author of the book:\n ");
        myBook.author = scanner.nextLine();

        System.out.print("Please enter the number of pages in the book:\n ");
        myBook.numberOfPages = scanner.nextInt();

       
        
        System.out.println(" The book title is: " + myBook.title);
        System.out.println("The book author is: " + myBook.author);
        System.out.println("The book has: " + myBook.numberOfPages +"pages" );

        // Close the scanner
        scanner.close();
    }
}

