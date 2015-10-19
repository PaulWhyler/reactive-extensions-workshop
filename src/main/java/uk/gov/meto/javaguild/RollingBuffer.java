package uk.gov.meto.javaguild;

import java.util.ArrayDeque;

public class RollingBuffer {

    private final ArrayDeque<Integer> buffer = new ArrayDeque<>(5);
    private final int bufferSize = 5;

    public synchronized void add(int value) {
...
    }

    public synchronized double getAverage() {
...
    }
}
