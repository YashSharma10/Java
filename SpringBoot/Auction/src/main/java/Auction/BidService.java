package Auction;

import java.util.List;

public interface BidService {
	void createAuction(String itemName, int initialPrice, int auctionId);

	void placeBid(int auctionId, String bidder, int amount);

	void getAuctionDetails(int auctionId);

	List<Bid> getBidsForAuction(int auctionId);
}
