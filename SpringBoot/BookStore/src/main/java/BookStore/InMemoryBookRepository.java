package BookStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {
	Map<Integer, Book> books = new HashMap<>();
	static int nextId = 1;

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<>(books.values());
	}

	@Override
	public Book getBookById(int id) {
		return books.get(id);
	}

	@Override
	public void addBook(Book book) {
		book.setId(nextId);
		books.put(nextId++, book);
	}

	@Override
	public void removeBook(int id) {
		books.remove(id);
	}
}
