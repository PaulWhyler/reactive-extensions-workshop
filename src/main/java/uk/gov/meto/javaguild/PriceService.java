package uk.gov.meto.javaguild;

import java.util.Random;

public class PriceService {

    private final int maxDelay;
    private final int minDelay;
    private final Random random = new Random();

    public PriceService() {
        maxDelay = 500;
        minDelay = 200;
    }

    public int getPrice() {
        try {
            Thread.sleep(delay());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return random.nextInt(1000);
    }

    private int delay() {
        return (int) (Math.random() * (maxDelay - minDelay) + minDelay);
    }
}
