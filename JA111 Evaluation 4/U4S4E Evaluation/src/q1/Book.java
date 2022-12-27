package q1;

public class Book {
	
	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	private int bookId;
	
	private String bookName;
	
	private String author;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Book b1 = this;
		Book b2 = (Book) obj;
		return b1.getBookId() == b2.getBookId();
	}
	
	
}
