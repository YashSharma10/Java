package Auction;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ConsoleUI {

	private static BidService bidService;


	@Autowired
	public ConsoleUI(BidService bidService) {
	    this.bidService = bidService;
	}


	public void start() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Create Auction");
			System.out.println("2. Place Bid");
			System.out.println("3. Get Auction Details");
			System.out.println("4. Get Bids for Auction");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				createAuction(scanner);
				break;
			case 2:
				placeBid(scanner);
				break;
			case 3:
				getAuctionDetails(scanner);
				break;
			case 4:
				getBidsForAuction(scanner);
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	private static void createAuction(Scanner scanner) {
		System.out.print("Enter auction ID: ");
		int auctionId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter item name: ");
		String itemName = scanner.nextLine();
		System.out.print("Enter initial price: ");
		int initialPrice = scanner.nextInt();
		bidService.createAuction(itemName, initialPrice, auctionId);
	}

	private static void placeBid(Scanner scanner) {
		System.out.print("Enter auction ID: ");
		int auctionId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter bidder name: ");
		String bidder = scanner.nextLine();
		System.out.print("Enter bid amount: ");
		int amount = scanner.nextInt();
		bidService.placeBid(auctionId, bidder, amount);
	}

	private static void getAuctionDetails(Scanner scanner) {
		System.out.print("Enter auction ID: ");
		int auctionId = scanner.nextInt();
		bidService.getAuctionDetails(auctionId);
	}

	private static void getBidsForAuction(Scanner scanner) {
		System.out.print("Enter auction ID: ");
		int auctionId = scanner.nextInt();
		bidService.getBidsForAuction(auctionId);
	}
}
