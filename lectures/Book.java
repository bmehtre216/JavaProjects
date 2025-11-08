package lectures;

public class Book {
	static int totalNoOfBooks;
	String author;
	String title;
	String isbn;
	
	boolean isBorrowed;
	
	static {
		totalNoOfBooks = 0;
	}
	{
		totalNoOfBooks++;
	}
	
	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public Book(String isbn) {
		this(isbn, "Unknown", "Unknown");
	}
	
	static int getTotalNoOfBooks() {
		return totalNoOfBooks;
	}
	
	void borrowBook() {
		if (isBorrowed) {
			System.out.println("Book is already Borrowed");
		} else {
			this.isBorrowed = true;
			System.out.println("Enjoy "+this.title);
		}
	}
	
	void returnBook() {
		if (isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope enjoyed, please leave the review");
		} else {
			System.out.println("this book is already in the library");
		}
	}
	
	
	public static void main(String[] args) {
		Book book = new Book("1", "Design", "Author");
		Book myBook = new Book("1");
		System.out.println(Book.getTotalNoOfBooks());
		
		book.borrowBook();
		myBook.borrowBook();
		book.borrowBook();
		book.returnBook();
		book.returnBook();
	}

}
