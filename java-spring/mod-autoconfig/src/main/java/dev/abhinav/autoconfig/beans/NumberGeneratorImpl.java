package dev.abhinav.autoconfig.beans;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();

    private int maxNumber = 100;

    // == public methods
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
