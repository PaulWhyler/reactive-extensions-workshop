package uk.gov.meto.javaguild;

import javax.swing.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 */
 public class App {

    static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
    static PriceService priceService = new PriceService();
    static PriceDisplay priceDisplay = new PriceDisplay();
    static RollingBuffer rollingBuffer = new RollingBuffer();

    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread(executor::shutdown));

        executor.scheduleWithFixedDelay(() -> {
            final int price = priceService.getPrice();
            rollingBuffer.add(price);
            SwingUtilities.invokeLater(() -> priceDisplay.setPrice(price));
            SwingUtilities.invokeLater(() -> priceDisplay.setAverage(rollingBuffer.getAverage()));
        }, 0, 500, TimeUnit.MILLISECONDS);

    }

}
