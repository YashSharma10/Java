package BookStore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	private List<Book> cart;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		this.cart = new ArrayList<>();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		return bookRepository.getBookById(id);
	}

	@Override
	public void addBookToCart(int bookId) {
		Book book = bookRepository.getBookById(bookId);
		if (book != null) {
			cart.add(book);
			System.out.println("Book added to the cart: " + book.getTitle());
		} else {
			System.out.println("Book not found");
		}
	}

	@Override
	public void placeOrder() {
		if (cart.isEmpty()) {
			System.out.println("Cart is empty. Add books to the cart first.");
		} else {
			System.out.println("Placing order for the following books:");
			for (Book book : cart) {
				System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " Rupees " + book.getPrice());
			}
			double total = 0.0;
			for (Book book : cart) {
			    total += book.getPrice();
			}

			System.out.println("Total: Rupees " + total);
			System.out.println("Order placed successfully. Thank you!");
			cart.clear();
		}
	}
}
