package question4;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Library l = new Library();
		Scanner sc = new Scanner (System.in);
		while (choice != 5) {
		
		System.out.println("1.Add Book\r\n"
				+ "2.Display all book details\r\n"
				+ "3.Search Book by author\r\n"
				+ "4.Count number of books - by book name\r\n"
				+ "5.Exit");
		 choice = sc.nextInt();
		
		
		if (choice == 1) {
			System.out.println("Enter the isbn no:");
			int isbn = sc.nextInt();
			
			System.out.println("Enter the book name:");
			String bookName = sc.next();
			
			System.out.println("Enter the author name:");
			String author = sc.next();
			
			Book b = new Book(isbn, bookName, author);
			
			l.addBook(b);
			
			System.out.println("Book added successfully");
			
		}
		else if (choice == 2){
			List<Book> books = l.viewAllBooks();
			if (l.bookList.size() == 0) {
				System.out.println("The list is empty");
			}
			else {
				for (int i = 0; i < books.size(); i++) {
					Book b = books.get(i);
					
					System.out.println("ISBN number : " + b.getIsbn());
					System.out.println("Book Name : " + b.getBookName());
					System.out.println("Author Name : " + b.getAuthor());
				}
			}
		}
		else if (choice == 3) {
			System.out.println("Enter the author name:");
			String author = sc.next();
			List<Book> books = l.viewBooksByAuthor(author);
			
			if (books == null) {
				System.out.println("The list is empty");
			}
			else {
				for (int i = 0; i < books.size(); i++) {
					Book b = books.get(i);
					
					System.out.println("ISBN number : " + b.getIsbn());
					System.out.println("Book Name : " + b.getBookName());
					System.out.println("Author Name : " + b.getAuthor());
				}
			}
		}
		else if (choice == 4) {
			System.out.println("Enter the book name:");
			String book = sc.next();
		 	int i = l.countNoOfBook(book);
		 	System.out.println(i);
		}
		else {
			System.out.println("Thank You..!!");
			break;
		}
		
	}
		
	
	}

}
