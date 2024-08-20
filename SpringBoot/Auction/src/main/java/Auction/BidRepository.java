package Auction;

import java.util.List;

public interface BidRepository {
    Bid save(Bid bid);

    Bid findById(int id);

    List<Bid> findAll();

    void deleteById(int id);
}
