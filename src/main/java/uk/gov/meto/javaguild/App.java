package uk.gov.meto.javaguild;

import rx.Observable;
import rx.Subscription;
import rx.schedulers.SwingScheduler;

import java.util.concurrent.TimeUnit;

/**
 *
 */
 public class App {

    static PriceService priceService = new PriceService();
    static PriceDisplay priceDisplay = new PriceDisplay();

    static Subscription subscription;

    public static void main(String[] args) throws InterruptedException {

        subscription = ...;
    }

}
