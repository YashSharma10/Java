package BooksMitali;
import java.util.ArrayList;
import java.util.Scanner;

public class Library_Management {

    static class Book {
        public static boolean isAvailable;
        String bookname;
        int serialnumber;
        int bookquantity;
        String Authorname;
        Scanner input = new Scanner(System.in);

        public Book(String bookname, String Authorname, int serialnumber, int quantity) {
            this.bookname = bookname;
            this.Authorname = Authorname;
            this.serialnumber = serialnumber;
            this.bookquantity = quantity;
        }

        
    }

    static ArrayList<Book> bookslist = new ArrayList<>();
    static ArrayList<Book> userbookslist = new ArrayList<>();
    

    public static void main(String[] args) {
        bookslist.add(new Book("Tiger","robin",234567 ,12));
        bookslist.add(new Book("Death","Sadhguru",123456,1));

        Scanner sc = new Scanner(System.in);
        Library_Management Books = new Library_Management();
        System.out.println("----- LIBRARY LOGIN PAGE -----\n");
        System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
        System.out.println("\nPlease enter the information ");

        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your Password:");
        String password = sc.nextLine();
        int choice;
        do {
            System.out.println("\n1. Display books");
            System.out.println("2. Add book");
            System.out.println("3. Remove book");
            System.out.println("4. Search Book");
            System.out.println("-------------------");
            System.out.println("5. Borrow book");
            System.out.println("6. User details");
            System.out.println("7. Return book");
            System.out.println("8. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nDisplaying books:");
                    displayBooks();
                    break;
                case 2:
                    System.out.println("Adding book:");
                    addBook(sc);
                    break;
                case 3:
                    System.out.println("Removing book:");
                    removeBook(sc);
                    break;
                case 4:
                    System.out.println("Search Book");
                    searchbook(sc);
                    break;
                case 5:
                    System.out.println("borrow book");
                    borrowbook(sc);
                    break;
                case 6:
                    System.out.println("user details");
                    userdetails(sc);
                    break;
                case 7:
                    System.out.println("return book");
                    returnbook(sc);
                    break;
                case 8:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);
        sc.close();
    }

    public static void addBook(Scanner sc) {

        System.out.println("Enter name of book:");
        String name = sc.next();
        System.out.println("Enter author name of book:");
        String authorname = sc.next();
        System.out.println("Enter the serial number:");
        int serialnumber = sc.nextInt();
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        Book newBook = new Book(name, authorname, serialnumber, quantity);
        bookslist.add(newBook);
    }

    public static void displayBooks() {
        System.out.println("Books available are as follows:");
        for (Book bookRecord : bookslist) {
        	System.out.println("Book Name: " + bookRecord.bookname + ", Author Name: " + bookRecord.Authorname
					+ ", Serial Number: " + bookRecord.serialnumber + ", Quantity: " + bookRecord.bookquantity);
        }
    }

    public static void removeBook(Scanner sc) {
        System.out.println("Enter the serial number of the book to be returned:");
        int bookSerialNumber = sc.nextInt();
        for (Book bookRecord : bookslist) {
            if (bookRecord.serialnumber == bookSerialNumber) {
                bookslist.remove(bookRecord);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with serial number " + bookSerialNumber + " not found.");
    }

    public static void searchbook(Scanner sc) {
        System.out.println("Book to be searched:");
        String bookname = sc.next();
        for (Book bookRecord : bookslist) {
            if (bookRecord.bookname.equals(bookname)) {
                bookslist.equals(bookRecord);
                System.out.println("book name : " + bookRecord.bookname +
                        " Author name : " + bookRecord.Authorname +
                        " serial number : " + bookRecord.serialnumber +
                        " book qunatity : " + bookRecord.bookquantity);
                return;
            }
        }
        System.out.println("Book " + bookname + " not found.");
    }

    public static void borrowbook(Scanner sc) {
        System.out.println("Book to be borrowed:");
        String bookname = sc.next();
        for (Book bookrecord : bookslist) {
            if (bookrecord.bookname.equals(bookname)) {
                userbookslist.add(bookrecord);
                System.out.println("Book borrowed : " + bookname);
                bookslist.remove(bookrecord);
                return;
            }
        }
        System.out.println("Book " + bookname + " not found.");

    }

    public static void userdetails(Scanner sc) {
        System.out.println("user details are:");
        for (Book bookrecord : userbookslist) {
        	System.out.println("Book Name: " + bookrecord.bookname + ", Author Name: " + bookrecord.Authorname
					+ ", Serial Number: " + bookrecord.serialnumber + ", Quantity: " + bookrecord.bookquantity);
        }
    }

    public static void returnbook(Scanner sc) {
        System.out.println("book to be returned:");
        String bookname = sc.next();
        for (Book userbook : userbookslist) {
            if (userbook.bookname.equals(bookname)) {
                bookslist.remove(userbook);
                bookslist.add(userbook);
                System.out.println("book returned : " + bookname);
                return;
            }
        }
        System.out.println("book " + bookname + " not returned");
    }
}