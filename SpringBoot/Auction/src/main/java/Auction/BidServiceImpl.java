package Auction;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class BidServiceImpl implements BidService {

	private final BidRepository bidRepository;
	
	public BidServiceImpl(BidRepository bidRepository) {
		this.bidRepository = bidRepository;
	}
	
	
	@Override
	public void createAuction(String itemName, int initialPrice, int auctionId) {
	    System.out.println("Auction created for item: " + itemName + " with initial price: " + initialPrice
	            + " and ID: " + auctionId);
	}


	@Override
	public void placeBid(int auctionId, String bidder, int amount) {
		Bid existingBid = bidRepository.findById(auctionId);

		if (existingBid == null || amount > existingBid.getAmount()) {
			Bid newBid = new Bid(auctionId, bidder, amount, LocalDateTime.now());
			bidRepository.save(newBid);
			System.out.println("Bid placed successfully by " + bidder + " with amount " + amount);
		} else {
			System.out.println("Bid amount must be higher than the current highest bid of " + existingBid.getAmount());
		}
	}

	@Override
	public void getAuctionDetails(int auctionId) {
		List<Bid> bidsForAuction = getBidsForAuction(auctionId);

		if (!bidsForAuction.isEmpty()) {
			Bid latestBid = bidsForAuction.get(bidsForAuction.size() - 1);
			System.out.println("Auction details for Auction ID: " + auctionId);
			System.out.println("Item: " + latestBid.getBidder());
			System.out.println("Highest Bid Amount: " + latestBid.getAmount());
			System.out.println("Timestamp: " + latestBid.getTimestamp());
		} else {
			System.out.println("Auction with ID " + auctionId + " not found.");
		}
	}

	@Override
	public List<Bid> getBidsForAuction(int auctionId) {
		List<Bid> allBids = bidRepository.findAll();
		List<Bid> bidsForAuction = new ArrayList<>();

		for (Bid bid : allBids) {
			if (bid.getId() == auctionId) {
				bidsForAuction.add(bid);
			}
		}

		if (!bidsForAuction.isEmpty()) {
			System.out.println("Bids for Auction ID: " + auctionId);
			for (Bid bid : bidsForAuction) {
				System.out.println("Bidder: " + bid.getBidder() + ", Amount: " + bid.getAmount() + ", Timestamp: "
						+ bid.getTimestamp());
			}
		} else {
			System.out.println("No bids found for Auction ID: " + auctionId);
		}

		return bidsForAuction;
	}
}
