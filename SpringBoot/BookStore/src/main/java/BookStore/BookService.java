package BookStore;

import java.util.List;

public interface BookService {
	
	List<Book> getAllBooks();

	Book getBookById(int id);

	void addBookToCart(int bookId);

	void placeOrder();
}
