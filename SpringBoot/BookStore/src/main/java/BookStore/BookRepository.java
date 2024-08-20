package BookStore;

import java.util.List;

public interface BookRepository {
	
	List<Book> getAllBooks();

	Book getBookById(int id);

	void addBook(Book book);

	void removeBook(int id);
}
