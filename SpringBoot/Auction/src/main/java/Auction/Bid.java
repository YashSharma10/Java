package Auction;

import java.time.LocalDateTime;

public class Bid {

	private int id;
	private String bidder;
	private int amount;
	private LocalDateTime timestamp;

	public Bid() {

	}

	public Bid(int id, String bidder, int amount, LocalDateTime timestamp) {
		this.id = id;
		this.bidder = bidder;
		this.amount = amount;
		this.timestamp = timestamp;
	}

	public int getId() {
		return id;
	}

	public String getBidder() {
		return bidder;
	}

	public int getAmount() {
		return amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBidder(String bidder) {
		this.bidder = bidder;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
