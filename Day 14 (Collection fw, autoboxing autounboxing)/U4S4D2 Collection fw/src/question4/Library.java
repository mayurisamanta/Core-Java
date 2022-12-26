package question4;

import java.util.ArrayList;
import java.util.List;


public class Library {

	List<Book> bookList = new ArrayList<>();
	
	void addBook (Book book) {

		bookList.add(book);
		System.out.println(bookList);
	}
	
	 boolean isEmpty() {
		 if (bookList.size() == 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 List<Book> viewAllBooks(){
		 return bookList;
	 }
	 
	 List<Book> viewBooksByAuthor(String author ) {
		 List<Book> b = new ArrayList<>();
		 
		 for (int i = 0; i < bookList.size(); i++) {
			 if (bookList.get(i).getAuthor().equalsIgnoreCase(author)) {
				 b.add(bookList.get(i));
			 }
		 }
		 
		 if (b.size() == 0) {
			 return null;
		 }
		 else {
			 return b;
		 }
	 }
	 
	 int countNoOfBook(String bookName) {
		 int count = 0;
		 
		 for (int i = 0; i < bookList.size(); i++) {
			 if (bookList.get(i).getBookName().equalsIgnoreCase(bookName)) {
				 count++;
			 }
		 }
		 return count;
	 }
}
