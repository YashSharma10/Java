package BookStore;

public class Main {
	public static void main(String[] args) {
		BookRepository bookRepository = new InMemoryBookRepository();
		Book book1 = new Book(1, "Rudest book ever", "ansh", 150);
		Book book2 = new Book(2, "Calculus", "yash", 200);
		Book book3 = new Book(3, "mohhit", "akul", 400);

		bookRepository.addBook(book1);
		bookRepository.addBook(book2);
		bookRepository.addBook(book3);

		BookService bookService = new BookServiceImpl(bookRepository);
		ConsoleU consoleUI = new ConsoleU(bookService);
		consoleUI.run();
	}
}
