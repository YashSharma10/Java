package BookStore;

import java.util.List;
import java.util.Scanner;

public class ConsoleU {
	private final BookService bookService;
	private final Scanner scanner;

	public ConsoleU(BookService bookService) {
		this.bookService = bookService;
		this.scanner = new Scanner(System.in);
	}

	public void run() {
		while (true) {
			System.out.println("1. View all books");
			System.out.println("2. Get book by ID");
			System.out.println("3. Add book to cart");
			System.out.println("4. Place order");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				displayAllBooks();
				break;
			case 2:
				getBookById();
				break;
			case 3:
				addBookToCart();
				break;
			case 4:
				placeOrder();
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private void displayAllBooks() {
		List<Book> books = bookService.getAllBooks();
		for (Book book : books) {
			System.out.println(
					book.getId() + ": " + book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice() + "\n");
		}
	}

	private void getBookById() {
		System.out.print("Enter book ID: ");
		int id = scanner.nextInt();
		Book book = bookService.getBookById(id);

		if (book != null) {
			System.out
					.println("Book found: " + book.getTitle() + " by " + book.getAuthor() + " Rupees " + book.getPrice());
		} else {
			System.out.println("Book not found");
		}
	}

	private void addBookToCart() {
		System.out.print("Enter book ID to add to cart: ");
		int bookId = scanner.nextInt();
		bookService.addBookToCart(bookId);
	}

	private void placeOrder() {
		bookService.placeOrder();
	}

	public static void main(String[] args) {
		ConsoleU consoleUI = new ConsoleU(new BookServiceImpl(new InMemoryBookRepository()));
		consoleUI.run();
	}
}
