package Auction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AuctionSystemMain {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AuctionSystemMain.class, args);
        MainApp initializer = context.getBean(MainApp.class);
        initializer.init();
    }
}

