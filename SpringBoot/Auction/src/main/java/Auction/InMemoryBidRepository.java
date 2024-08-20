package Auction;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryBidRepository implements BidRepository {

    private final Map<Integer, Bid> bidMap = new HashMap<>();

    @Override
    public Bid save(Bid bid) {
        bidMap.put(bid.getId(), bid);
        return bid;
    }

    @Override
    public Bid findById(int id) {
        return bidMap.get(id);
    }

    @Override
    public List<Bid> findAll() {
        return new ArrayList<>(bidMap.values());
    }

    @Override
    public void deleteById(int id) {
        bidMap.remove(id);
    }
}



