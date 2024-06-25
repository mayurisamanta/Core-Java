public class Book {

    private String title;
    private String author;
    private Double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 500.0);
        book1.displayDetails();
        Book book2 = new Book("Python Programming", "Guido van Rossum", 600.0);
        book2.displayDetails();
    }
}