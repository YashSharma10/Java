package Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainApp {

    private final ConsoleUI auctionSystemUI;

    @Autowired
    public MainApp(ConsoleUI auctionSystemUI) {
        this.auctionSystemUI = auctionSystemUI;
    }

    public void init() {
        auctionSystemUI.start();
    }

}

